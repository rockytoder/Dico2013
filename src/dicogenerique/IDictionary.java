package dicogenerique;
/**
 * @author Cheng LEI
 */
public interface IDictionary<X,Y> {
	public Y get(X key);
	public void Put(X key, Y value);
	public boolean isEmpty();
	public boolean containsKey(X Key);
}
