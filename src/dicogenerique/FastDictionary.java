package dicogenerique;

public class FastDictionary<X,Y> extends AbstractDictionary<X,Y>{
	/**
	 * @author Cheng LEI
	 */
	public FastDictionary(){
		keys = (X[]) new Object[5];
		values = (Y[]) new Object[5];		
	}
	private FastDictionary(int nouvelletaille){
		keys = (X[]) new Object[nouvelletaille];
		values = (Y[]) new Object[nouvelletaille];
	}

	@Override
	public int indexOf(Object key) {
		int index = key.hashCode()%keys.length;		
		for(int i = 0; i < keys.length; i ++){
			if(index < 0 || index > keys.length-1)
				index = 0;		
			if(keys[index] == key)
				return index;
			index ++;
		}
		return -1;	
	}

	@Override
	public int newIndexOf(Object key) {
		this.grow();
		int newindex = key.hashCode()%keys.length;
		for(int i = 0; i < keys.length; i ++){
			newindex ++;
			if(newindex < 0 || newindex > keys.length-1)
				newindex = 0;			
			if(keys[newindex] == null)
				break;
		}
		return newindex;
	}
	
	public boolean mustGrow(){
		if(size() > keys.length*3/4)
			return true;
		else return false;
	}
	
	public void grow(){
		if(this.mustGrow()){
			int nouvelletaille = (size()+1) * 4 / 3;
			FastDictionary newFD = new FastDictionary(nouvelletaille); 
			for(int i = 0; i != keys.length; i++){
				if(keys[i] != null)
					newFD.Put(keys[i], values[i]);
			}
			keys = (X[]) newFD.keys;
			values = (Y[]) newFD.values;
		}
	}
}
