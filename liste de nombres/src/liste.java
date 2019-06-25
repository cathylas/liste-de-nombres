import java.sql.Array;
import java.util.Arrays;

public class liste {

	public static void main(String[] args) {

		int array[] = { 11, 34, 23, 62, 6, 41 }; // initialiser le tableau

		for (int entier : array) {
			System.out.println("nombre: " + entier);
		}

		Arrays.sort(array); // trier le tableau

		System.out.println("Tableau trié\n"); // afficher tous les entiers en ordre croissant
		for (int entier : array) {
			System.out.println("nombre: " + entier);

		}
		System.out.println("Tableau trié\n"); // afficher tous les entiers en ordre croissant
		for (int i = array.length-1 ; i > -1; i--) {
			System.out.println("nombre: " + array[i]);
		}
		System.out.println("au revoir");
	}
}
