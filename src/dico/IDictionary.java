package dico;
/**
 * @author Cheng LEI
 */
public interface IDictionary {
	public Object Get(Object Key);
	public Object Put(Object Key,Object value);
	public boolean isEmpty();
	public boolean containsKey(Object Key);
}
