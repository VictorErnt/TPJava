import java.util.ArrayList;

public class Module {
	private String Nom;
	private int codeModule;
	private String enseignantRef;
	private ArrayList<String> enseignant;
	private ArrayList<String> eleve;
	
	///////////////Constructor
	public Module(String Nom, int codeModule, String enseignantRef) {
		enseignant=new ArrayList<String>();
		eleve=new ArrayList<String>();
		this.Nom=Nom;
		this.codeModule=codeModule;
		this.enseignantRef=enseignantRef;
	}
	
	///////////////Methods
	public void ajoutEnseignant(Enseignant ens) {
		enseignant.add(ens.getNomEnseignant());
	}
	
	public void retirerEnseignant(Enseignant ens) {
		if(enseignant.contains(ens.getNomEnseignant())){
			int a=enseignant.indexOf(ens.getNomEnseignant());
			enseignant.remove(a);
		}
		else {
			System.out.println("Cet enseignant n'est pas associer au module");
			
		}
	}
	public void ajoutEleve(Etudiant etu) {
		eleve.add(etu.getNomEtudiant());
	}
	
	public void retirerEleve(Etudiant etu) {
		if(eleve.contains(etu.getNomEtudiant())){
			int a=eleve.indexOf(etu.getNomEtudiant());
			eleve.remove(a);
		}
		else {
			System.out.println("Cet élève n'est pas associer au module");
		}
	}

	public void changementRef(String nomEnseignant) {
		enseignantRef=nomEnseignant;
	}
	
	
	/////////////////////// Methods Get
	
	public ArrayList<String> getEtudiants(){
		return eleve;
	}
	public ArrayList<String> getEnseignants(){
		return enseignant;
	}
	public String getEnsRef(){
		return enseignantRef;
	}
	public String getNomModule(){
		return Nom;
	}
	public int getCodeModule(){
		return codeModule;
	}
}
