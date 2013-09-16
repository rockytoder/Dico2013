package dico;

import java.util.Arrays;

public class SortedDictionary extends AbstractDictionary {
	/**
	 * @author Cheng LEI
	 */
	public SortedDictionary() {
		keys = new Object[0];
		values = new Object[0];
	}
	
	public SortedDictionary(int taille){
		keys = new Object[taille];
		values = new Object[taille];
	}
	
	public void Sorted(){
		String[] key = new String[keys.length];
		String[] value = new String[values.length];
		for(int i = 0;i < keys.length;i++){
			key[i] = keys[i].toString();
			value[i] = values[i].toString();
		}
		Arrays.sort(key,String.CASE_INSENSITIVE_ORDER);
		for(int i = 0;i < key.length;i++){
			keys[i] = key[i];
			values[i] = value[i];
		}
	}

	@Override
	public int indexOf(Object key) {
		this.Sorted();
		for(int i = 0; i < keys.length; i ++){
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
			keys = newkeys;
			values = newvalues;	
		}
		return newindex;				
	}

}
