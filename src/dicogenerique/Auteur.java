package dicogenerique;
/**
 * @author Cheng LEI
 */
public class Auteur {
	String nom;
	String prenom;
	
	public Auteur(String nom,String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String toString(){
		return (this.nom+" "+this.prenom);
	}

}
