package poo.tp02.arrays;

import poo.tp02.arrays.Complex;

/**
 * Main class to demonstrate working with 2D arrays of Complex numbers.
 */
public class Main {

    // Static 2D arrays of Complex objects representing collections of complex numbers
    static Complex[][] tabComp1 = {
        {new Complex(1.2, 1.5), new Complex(1.2, 2.3), new Complex(3.8, 3.9)},
        {new Complex(0.2, 0.5), new Complex(1.1, 1.3)},
        {new Complex(1.2, 1.5), new Complex(2.1, 2.3), new Complex(3.8, 3.9), new Complex(8.8, 9.9)},
        {new Complex(1.2, 1.5)},
        {new Complex(1.2, 1.5), new Complex(2.1, 2.3)}
    };
    
    static Complex[][] tabComp2 = {
        {new Complex(1.2, 1.5)},
        {}, // Empty row
        {new Complex(1.2, 1.5), new Complex(2.1, 2.3), new Complex(3.8, 3.9), new Complex(8.8, 9.9)},
        {} // Empty row
    };

    // Instance variable declaration (not initialized)
    Complex[][] tabComp3;

    /**
     * Displays a 2D array of Complex objects along with the total number of elements.
     * array The 2D array of Complex objects to display.
     */
    public static void display2DComplexArray(Complex[][] array){
        int count = 0; // Counter for total number of elements
        System.out.println("Nombre de lignes du tableau : " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ligne " + (i+1) + ": ");
            if(array[i].length == 0){
                System.out.println("La ligne ne contient aucun élément. La taille de la ligne est égale à 0.");
            }
            else{
                System.out.print("Taille = " + array[i].length + ": ");
                System.out.print("Éléments : ");
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                    count++; // Increment the counter for each element
                }
                System.out.println();
            }
        }
        System.out.println("Nombre total d'éléments du tableau : " + count);
    }

    /**
     * Main method to demonstrate the display of 2D arrays of Complex objects.
     */
    public static void main(String[] args) {
        // Display the contents of tabComp1
        display2DComplexArray(tabComp1);
        // Display the contents of tabComp2
        display2DComplexArray(tabComp2);
    }
}
