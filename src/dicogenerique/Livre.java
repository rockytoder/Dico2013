package dicogenerique;
/**
 * @author Cheng LEI
 */
public class Livre {
	private String nom;
	private int annee;
	
	public Livre(String nom,int annee){
		this.nom = nom;
		this.annee = annee;
	}
	
	public String toString(){
		return(this.nom+","+this.annee);
	}
}
