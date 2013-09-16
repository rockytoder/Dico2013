package dico;
/**
 * @author Cheng LEI
 */
public abstract class AbstractDictionary implements IDictionary{
	Object[] keys;
	Object[] values;
	
	public abstract int indexOf(Object key);
	
	public abstract int newIndexOf(Object key);
	
	public int size() {
		int size = 0;
		for(int i = 0; i != keys.length; i++){
			if(keys[i] != null && values[i] != null)
				size ++;
		}		
		return size;
	}
	
	public boolean isEmpty(){
		return (size() == 0);
	}
	
	public boolean containsKey(Object Key){
		for(int i = 0;i<keys.length;i++){
				if(keys[i]==Key)
			return true;
		}
		return false;
	}
	
	public Object Get(Object key){
		if(this.containsKey(key)){
			return values[indexOf(key)];
		}else{
			return null;
		}
	}
	
	public Object Put(Object key, Object value){
		int index;
		if(this.containsKey(key)){
			index = indexOf(key);
			values[index] = value;
		}else{
			index = newIndexOf(key);
			keys[index] = key;
			values[index] = value;
		}		
		return this;
	}
	
	public void affichage(){
		for(int i = 0; i < keys.length; i++){
			System.out.println(keys[i]+" --> "+values[i]);
		}
	}
	
}

