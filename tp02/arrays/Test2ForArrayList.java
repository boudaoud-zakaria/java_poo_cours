package poo.tp02.arrays;

import java.util.ArrayList;

import poo.tp02.arrays.Complex; // Importing the Complex class

public class Test2ForArrayList {

    // Declaring ArrayLists to hold Complex objects
    static ArrayList<Complex> complexList01 = new ArrayList<>();
    static ArrayList<Complex> complexList02 = new ArrayList<>();
    static ArrayList<Complex> complexList03 = new ArrayList<>();

    public static void main(String[] args) {
        // Printing the contents of complexList01
        System.out.println(complexList01);

        // Adding Complex objects to complexList01
        complexList01.add(new Complex(1, 5));
        complexList01.add(new Complex(2, 10));
        complexList01.add(new Complex(4, 20));
        complexList01.add(new Complex(20, 100));

        // Printing the updated contents of complexList01
        System.out.println(complexList01);

        // Adding a Complex object to the beginning of complexList01
        complexList01.add(0, new Complex(20, 100));
        System.out.println(complexList01);

        // Printing the size of complexList01
        System.out.println("la taille de la liste est : " + complexList01.size());

        // Removing a Complex object at index 2 from complexList01
        complexList01.remove(2);
        System.out.println("Après suppression à la position 2 :" + complexList01);

        // Removing a specific Complex object from complexList01
        complexList01.remove(new Complex(4, 20));
        System.out.println(complexList01);

        //! partie 2:

        // Printing the size of complexList02
        System.out.println("\n\n la tialle de la liste complex 2 :" + complexList02.size());

        // Adding Complex objects to complexList02
        complexList02.add(new Complex(200, 200));
        complexList02.add(new Complex(300, 300));
        complexList02.add(new Complex(400, 400));

        // Printing the contents of complexList02
        System.out.println(complexList02);

        // Adding complexList01 to complexList02
        complexList03.add(new Complex(1, 1));
        complexList02.addAll(complexList01);
        complexList03.addAll(complexList02);

        // Printing the updated size and contents of complexList02
        System.out.println(" la tialle de la liste complex 2 :" + complexList02.size());
        System.out.println(complexList02);

        // Printing the contents of complexList03
        System.out.println("complex liste 3 : " + complexList03);
    }
}
