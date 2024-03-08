package poo.tp02.arrays;

// ArrayManip class for array manipulation
public class ArrayManip {
    
    // Main method
    public static void main(String[] args) {
        // Declaration and initialization of integer arrays
        int[] tabInt1 = {1, 12, 3, 4, 5, 12, 7, 8};
        int[] tabInt2 = {10, 20, 7, 40, 50, 7, 7, 80, 90, 100, 7, 120};

        // Declaration and initialization of Complex arrays
        Complex[] tabComp1 = {
            new Complex(10.3, 5.5), 
            new Complex(7.7, 2.2), 
            new Complex(10.3, 5.5)
        };
        Complex[] tabComp2 = {
            new Complex(3.3, 4.4), 
            new Complex(6.6, 8.8), 
            new Complex(9.9, 10.10)
        };

        // Declaration and initialization of Fraction arrays
        Fraction[] tabFrac1 = {
            new Fraction(5, 7), 
            new Fraction(3, 4), 
            new Fraction(5, 7)
        };
        Fraction[] tabFrac2 = {
            new Fraction(2, 3), 
            new Fraction(4, 5), 
            new Fraction(15, 8)
        };

        // Print the Fraction array tabFrac2 using enhanced for loop
        for (Fraction fraction : tabFrac2) {
            System.out.println(fraction);
        }

        // Calls to the occurrence methods with corresponding arrays
        int occurrenceInt1 = occurrence(tabInt1, 12);
        int occurrenceInt2 = occurrence(tabInt2, 7);
        int occurrenceComp1 = occurrence(tabComp1, new Complex(10.3, 5.5));
        int occurrenceComp2 = occurrence(tabComp2, new Complex(6.6, 8.8));
        int occurrenceFrac1 = occurrence(tabFrac1, new Fraction(5, 7));
        int occurrenceFrac2 = occurrence(tabFrac2, new Fraction(15, 8));

        // Display the results
        System.out.println("Le nombre de fois que la valeur 12 apparait dans le tableau tabInt1 est : " + occurrenceInt1);
        if (occurrenceInt2 == 0) {
            System.out.println("Aucune occurrence trouvée de la valeur 7 dans le tableau tabInt2");
        } else {
            System.out.println("Le nombre de fois que la valeur 7 apparait dans le tableau tabInt2 est : " + occurrenceInt2);
        }
        System.out.println("Le nombre de fois que le nombre complexe (10.3,5.5) apparait dans le tableau tabComp1 est : " + occurrenceComp1);
        if (occurrenceComp2 == 0) {
            System.out.println("Aucune occurrence trouvée du nombre complexe (6.6,8.8) dans le tableau tabComp2");
        } else {
            System.out.println("Le nombre de fois que le nombre complexe (6.6,8.8) apparait dans le tableau tabComp2 est : " + occurrenceComp2);
        }
        
        System.out.println("Le nombre de fois que la fraction 5/7 apparait dans le tableau tabFrac1 est : " + occurrenceFrac1);
        if (occurrenceFrac2 == 0) {
            System.out.println("Aucune occurrence trouvée de la fraction 15/8 dans le tableau tabFrac2");
        } else {
            System.out.println("Le nombre de fois que la fraction 15/8 apparait dans le tableau tabFrac2 est : " + occurrenceFrac2);
        }
    }

    // Method to find occurrences of an integer value in an integer array
    public static int occurrence(int[] tableau , int valeur){
        if(tableau == null) return -1;
        int count = 0;

        for (int i : tableau) {
            if(i == valeur) count++;
        }
        return count;
    }

    // Method to find occurrences of a Complex object in a Complex array
    public static int occurrence(Complex[] tableau ,Complex valeur ){
        if(tableau == null) return -1;

        int count = 0;

        for (Complex comp : tableau) {
            if(comp.equals(valeur)) count++;
        }
        return count;
    }

    // Method to find occurrences of a Fraction object in a Fraction array
    public static int occurrence(Fraction[] tableau ,Fraction valeur ){
        if(tableau == null) return -1;

        int count = 0;

        for (Fraction comp : tableau) {
            if(comp.equals(valeur)) count++;
        }
        return count;
    }
}
