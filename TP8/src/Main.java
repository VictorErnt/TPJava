import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		initialisation();
	}

	public static void initialisation() {
		
		Module II1102=new Module("Info",1,"Victor");
		Enseignant Victor= new Enseignant("Martin","Victor","Email","Cuisine");
		Etudiant Alexis=new Etudiant("Laude","Alexis","Email","Incroyable");
		
		II1102.ajoutEnseignant(Victor);
		II1102.ajoutEleve(Alexis);
		Victor.Notation(Alexis, II1102, 6);
		System.out.println(Alexis.moyenneEleve());
		//System.out.println(Alexis.getNotesModule());
	}
}

