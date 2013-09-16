package dico;
/**
 * @author Cheng LEI
 */
public class Main {
	public static void main(String[] args){
		
		/*ici vous pouvez mettre les deux autres en commentaire pour faire le test*/
		AbstractDictionary D = new OrderedDictionary();
//		AbstractDictionary D = new SortededDictionary();
//		AbstractDictionary D = new FastdDictionary();
		
		System.out.println("D est vide ? " + D.isEmpty());
		System.out.println("Taille de D : " + D.size());
		D.Put("AXCVB", "QQQ");	
		D.Put("ZSDFG", "AAA");
		System.out.println("ZSDFG est dans D ? " + D.containsKey("ZSDFG"));
		System.out.println("RGBRG est dans D ? " + D.containsKey("RGBRG"));
		System.out.println(D.Get("ZSDFG"));
		System.out.println("D est vide ? " + D.isEmpty());
		D.affichage();
		System.out.println("=====================================================");
		D.Put("QWERT", "ZZZ");
		D.Put("GHJGH", "XXX");
		D.Put("UYIYU", "SSS");
		D.Put("RGBRG", "WWW");
		System.out.println("Taille de D : " + D.size());
		System.out.println("Taille de Dic : " + D.keys.length);
		System.out.println(" RGBRG est dans D ? " + D.containsKey("RGBRG"));
		System.out.println(D.Get("RGBRG"));
		D.affichage();
		System.out.println("=====================================================");	
	}
}