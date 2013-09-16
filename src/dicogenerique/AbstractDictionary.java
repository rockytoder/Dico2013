package dicogenerique;
/**
 * @author Cheng LEI
 */
public abstract class AbstractDictionary<X,Y> implements IDictionary<X,Y>{	
	Y[] values;
	X[] keys;
	public abstract int indexOf(X key);
	
	public abstract int newIndexOf(X key);
	
	public int size() {
		int size = 0;
		for(int i = 0; i != keys.length; i++){
			if(keys[i] != null && values[i] != null)
				size ++;
		}		
		return size;
	}
	
	public boolean isEmpty(){
		return (this.size() == 0);
	}
	
	public boolean containsKey(X Key){
		for(int i = 0;i<keys.length;i++){
				if(keys[i]==Key)
			return true;
		}
		return false;
	}
	
	public Y get(X key){
		if(this.containsKey(key)){
			return values[indexOf(key)];
		}else{
			return null;
		}
	}
	
	public void Put(X key, Y value){
		int index;
		if(this.containsKey(key)){
			index = indexOf(key);
			values[index] =  value;
		}else{
			index = newIndexOf(key);
			keys[index] =  key;
			values[index] = (Y) value;
		}		
	}
	
	public void affichage(){
		for(int i = 0; i < keys.length; i++){
			System.out.println(keys[i]+" => "+values[i]);
		}
	}
}