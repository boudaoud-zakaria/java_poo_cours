package tp_02.tableau1d;

import java.util.Scanner;

/**
 * RechercheDansTableau1D class demonstrates searching for an integer in a one-dimensional array.
 */
public class RechercheDansTableau1D {

    /**
     * The main method of the RechercheDansTableau1D class.
     * It initializes an integer array, performs a search for a specific value in the array,
     * and then prints the result and the elements of the array using different looping techniques.
     *
     */
    public static void main(String[] args) {
        // Initialize an integer array
        int[] tabInt = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        // Value to search for in the array
        int valeurRecherchee = 50;

        // Perform search for the specified value in the array
        int position = rechEntier(tabInt, valeurRecherchee);

        // Print the result of the search
        if (position != -1) {
            System.out.println("La valeur : " + valeurRecherchee + " se trouve dans la case i = " + position);
        } else {
            System.out.println("La valeur : " + valeurRecherchee + " n'existe pas dans le tableau");
        }

        // Print the elements of the array using a traditional for loop
        for (int i = 0; i < tabInt.length; i++) {
            System.out.println(tabInt[i]);
        }

        // Print the elements of the array using a foreach loop
        System.out.println("Foreach loop:");
        for (int element : tabInt) {
            System.out.println(element);
        }
    }

    /**
     * Search for an integer value in a given integer array.
     *
     * --- tableau The integer array to search in.
     * --- valeur The integer value to search for.
     * --- The index of the first occurrence of the value in the array, or -1 if the value is not found.
     */
    public static int rechEntier(int[] tableau , int valeur) {
        if (tableau != null) {
            for (int i = 0; i < tableau.length; i++) {
                if (tableau[i] == valeur) {
                    return i; // Return the index of the value if found
                }
            }
        }
        return -1; // Return -1 if the value is not found in the array
    }
}
