package dicogenerique;

public class Main {
	/**
	 * @author Cheng LEI
	 */
	public static void main(String[] args){
		AbstractDictionary<Auteur,Livre> OD = new SortedDictionary<Auteur,Livre>();
		Auteur leicheng = new Auteur("lei","qheng");
		Auteur xeicheng = new Auteur("vei","wheng");
		Auteur ceicheng = new Auteur("bei","eheng");
		Auteur veicheng = new Auteur("nei","rheng");
		Auteur beicheng = new Auteur("wei","theng");
		
		Livre livre = new Livre("Les Trois Mousquetaires",1801);
		Livre qivre = new Livre("Les Quatre Mousquetaires",1802);
		Livre divre = new Livre("Les Cinq Mousquetaires",1803);
		Livre fivre = new Livre("Les Six Mousquetaires",1804);
		Livre givre = new Livre("Les Sept Mousquetaires",1805);
		
		OD.Put(leicheng,livre);
		OD.Put(xeicheng,qivre);
		OD.Put(ceicheng,divre);
		OD.Put(veicheng,fivre);
		OD.Put(beicheng,givre);
		((SortedDictionary<Auteur, Livre>) OD).Sorted();
		OD.affichage();
	}
}