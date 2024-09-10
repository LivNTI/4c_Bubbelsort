package BubbleSort;

public class BS {
    static public void main(String[] args) {
        System.out.println("Bubble Sort");

        int[] lista = new int[] { 5, 2, 7, 4, 9 };

        boolean hasSwitched = false;

        do{
            hasSwitched = false;
        for (int i = 0; i < lista.length - 1; i++) {
            // plocka ut två tal
            int tal1 = lista[i];
            int tal2 = lista[i + 1];

            // om talen inte är sorterade, byt plats
            if (tal1 > tal2) {
                lista[i] = tal2;
                lista[i + 1] = tal1;
                hasSwitched = true;
            }
        }

        // print the array
        printList(lista);

    }while (hasSwitched);

    }

    /**
     * Prints an array
     * 
     * @param myList
     */
    public static void printList(int[] myList) {
        for (int tal : myList) {
            System.out.print(tal + " , ");

        }
        System.out.println();

    }

}
