import java.util.ArrayList;

public class Etudiant {
	private String Nom;
	private String Prenom;
	private String Email;
	private String niveauEtude;
	//private ArrayList<ArrayList<Integer>> Notes;
	private ArrayList<Integer> notesModule;
	
	/////////////////Constructor
	public Etudiant(String Nom,String Prenom,String Email,String niveauEtude) {
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Email=Email;
		this.niveauEtude=niveauEtude;
		//Notes= new ArrayList<ArrayList<Integer>>();
		notesModule= new ArrayList<Integer>();
	}
	
	/////////////Methods
	public double moyenneEleve() {
		double total=0;
		int note;
		for (int i=0;i<notesModule.size();i++) {
			note=notesModule.get(i);
		    total += note;
		}
		double moyenne = total / notesModule.size();

		return moyenne;
	}
	
	///////////////////////// Method Get
	public String getNomEtudiant(){
		return Nom;
	}
	
	public void ajoutNote(int a) {
		notesModule.add(a);
	}
	/*
	public ArrayList<ArrayList<Integer>> getNotes(){
		return Notes;
	}
	*/

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public ArrayList<Integer> getNotesModule1() {
		return this.notesModule;
	}
}
