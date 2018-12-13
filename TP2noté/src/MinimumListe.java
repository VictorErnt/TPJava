import java.util.*;

public class MinimumListe {
	
	public static int min(List<Integer> liste) {
		int a=liste.get(0);
		for(int i=1; i<liste.size();i++) {
			if(liste.get(i)<a) {
				a=liste.get(i);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lists= new ArrayList<>();
		lists.add(1);
		lists.add(1);
		lists.add(1);
		lists.add(1);
		System.out.println(lists.get(2));
		lists.set(2, 5);
		System.out.println(lists.get(2));
		//System.out.println(min(list));
	}

}
