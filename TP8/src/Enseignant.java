import java.util.ArrayList;

public class Enseignant {
	private String Nom;
	private String Prenom;
	private String Email;
	private String Specialite;
	
	//////////////Constructor
	public Enseignant(String Nom,String Prenom,String Email,String Specialite) {
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Email=Email;
		this.Specialite=Specialite;
	}
	
	/////////////Methods
	public void Notation(Etudiant etudiant, Module mod,int Notes ) {
		if(mod.getEnseignants().contains(Nom) && mod.getEtudiants().contains(etudiant.getNomEtudiant())) {
			etudiant.getNotesModule1().add(Notes);
		}
		else {
			System.out.println("Une erreur est survenue");
		}
	}
	
	public String getNomEnseignant(){
		return Nom;
	}
	
}
