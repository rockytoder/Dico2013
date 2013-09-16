package dicogenerique;

import java.util.Arrays;

public class SortedDictionary<X,Y> extends AbstractDictionary<X,Y> {
	/**
	 * @author Cheng LEI
	 */
	public SortedDictionary() {
		keys = (X[]) new Object[0];
		values = (Y[]) new Object[0];
	}
	
	public SortedDictionary(int taille){
		keys = (X[]) new Object[taille];
		values = (Y[]) new Object[taille];
	}
	
	public void Sorted(){
		if(this.keys != null){
			String[] key = new String[keys.length];
			String[] value = new String[values.length];
			for(int i = 0;i < keys.length;i++){
				key[i] = this.keys[i].toString();
				value[i] = this.values[i].toString();
			}
			Arrays.sort(key,String.CASE_INSENSITIVE_ORDER);
			for(int i = 0;i < key.length;i++){
				keys[i] = (X) key[i];
				values[i] = (Y) value[i];
			}
		}	
	}
	
	@Override
	public int indexOf(Object key) {
		for(int i = 0; i != keys.length; i ++){
			if(keys[i] == key)
				return i;			
		}		
		return -1;
	}

	@Override
	public int newIndexOf(Object key) {		
		int newindex = this.size();
		if(size() >= keys.length){			
			Object[] newkeys = new Object[keys.length + 1];
			Object[] newvalues = new Object[values.length + 1];
			this.Sorted();
			for(int i = 0; i < keys.length; i ++){
				newkeys[i] = keys[i];
				newvalues[i] = values[i];
			}
			keys = (X[]) newkeys;
			values = (Y[]) newvalues;	
		}
		return newindex;				
	}

}