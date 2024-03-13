public class arrays {

    public static void main(String[] args) {
        
        // Creating a one-dimensional array T of size 6
        int[] T = new int[6];

        // Assigning values to elements of array T
        T[0] = 10;
        T[1] = 20;
        T[2] = 30;

        // Creating and initializing a one-dimensional array N
        int[] N = {23 , 50 , 40 , 10 };

        // Printing elements of array T using a loop
        for (int i = 0; i < T.length; i++) {
            System.out.println(T[i]);
        }

        //! **************************** 

        // Creating a two-dimensional array T2 with varying row lengths
        int[][] T2 = new int[6][];

        // Initializing elements of array T2
        T2[0] = new int[1];
        T2[1] = new int[0];
        T2[2] = new int[4];
        T2[3] = new int[1];
        T2[4] = new int[3];
        T2[5] = new int[5];
        
        // Assigning values to certain elements of T2
        T2[0][0] = 1;
        T2[2][0] = 1;
        T2[2][1] = 2;
        T2[2][2] = 3;
        T2[2][3] = 4;
        T2[4][0] = 1;
        T2[4][1] = 2;
        T2[4][2] = 3;
        T2[5][0] = 1;
        T2[5][1] = 2;
        T2[5][2] = 3;
        T2[5][3] = 4;
        T2[5][4] = 5;

        // Printing elements of array T2
        for (int i = 0; i < T2.length; i++) {
            for (int j = 0; j < T2[i].length; j++) {
                System.out.print(T2[i][j]);
            }
            System.out.println();
        }

        // Creating and initializing a two-dimensional array T2_2
        int[][] T2_2 = {
            {1 , 2 , 3},
            {1 , 2 , 3 , 4},
            {},
            {1},
            {1 , 2 , 3 , 4 , 5 , 6}
        };

        // Printing elements of array T2_2
        for (int i = 0; i < T2_2.length; i++) {
            for (int j = 0; j < T2_2[i].length; j++) {
                System.out.print(T2_2[i][j]);
            }
            System.out.println();
        }

        // Creating an array of objects of type test
        test[] arrayObj = new test[3];

        // Initializing elements of arrayObj
        arrayObj[0] = new test(10);
        arrayObj[1] = new test(20);
        arrayObj[2] = new test(30);

        // Creating and initializing an array of objects of type test
        test[] arrayObjI = {
            new test(10),
            new test(20),
            new test(30)
        };

        // Modifying properties of elements of arrayObj
        arrayObj[0].var1 = 40;
        arrayObj[1].var1 = 50;
        arrayObj[2].var1 = 60;

        // Printing values of properties of elements of arrayObj
        System.out.println(arrayObj[0].var1);
        System.out.println(arrayObj[1].var1);
        System.out.println(arrayObj[2].var1);

        // Creating a two-dimensional array of objects of type test
        test[][] array2D = new test[2][];
        array2D[0] = new test[3];
        array2D[1] = new test[2];

        // Creating and initializing a two-dimensional array of objects of type test
        test[][] array2DI = {
            {
                new test(10) ,
                new test(20) , 
                new test(10)  
            },
            {
                new test(10) ,
                new test(20)  
            }
        };
    }

    // Declaration of a test object outside of the main method
    test obj = new test(10 , 20 , 30 , 40);
}
