import java.util.Scanner;

public class Main {
    static boolean symmetrical(int[][] arr) {
        for (int i=0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                return false;
            }
            for (int j=0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Skriv en metod som kontrollerar om en 2D-array är symmetrisk.
        //  - Lika många rader som kolumner
        //  - För alla i och j gäller att [i][j] == [j][i]
        //
        // Testa genom att läsa in en 4x4 array i main och kalla på metoden

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[4][4];

        for (int i=0; i < 4; i++) {
            for (int j=0; j < 4; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }

        if (symmetrical(arr)) {
            System.out.println("Symmetrisk");
        } else {
            System.out.println("Inte symmetrisk");
        }
    }
}