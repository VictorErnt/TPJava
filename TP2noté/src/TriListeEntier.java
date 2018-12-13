import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TriListeEntier {


	public static int min(List<Integer> liste) {
		int a=liste.get(0);
		for(int i=1; i<liste.size();i++) {
			if(liste.get(i)<a) {
				a=liste.get(i);
			}
		}
		return a;
	}

	public static void triListe(List<Integer> liste) {
		try {
			List<Integer> ListTemp=liste;
			List<Integer> subList=new ArrayList<>();
			int L=ListTemp.size();
			for (int i=0;i<L;i++) {
				subList.add(min(ListTemp));
				int a=ListTemp.indexOf(min(ListTemp));
				ListTemp.remove(a);
			}
			System.out.println(subList);
		}catch(Exception e) {
			System.out.println("Une erreur est survenue");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> bibliotheque = new HashMap<>(); 
		
		ArrayList<Integer> list= new ArrayList<>(
				Arrays.asList(2,-6,1,5,5,5,7,6,8,0));
		triListe(list);
	}

}
