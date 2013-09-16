package dico;

public class OrderedDictionary extends AbstractDictionary{
	/**
	 * @author Cheng LEI
	 */
	public OrderedDictionary() {
		keys = new Object[0];
		values = new Object[0];
	}
		
	public OrderedDictionary(int taille){
		keys = new Object[taille];
		values = new Object[taille];
	}
	
	public int indexOf(Object key) {
		for(int i = 0; i != keys.length; i ++){
			if(keys[i] == key)
				return i;			
		}		
		return -1;
	}

	public int newIndexOf(Object key) {		
		int newindex = this.size();
		if(size() >= keys.length){			
			Object[] newkeys = new Object[keys.length + 1];
			Object[] newvalues = new Object[values.length + 1];
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
