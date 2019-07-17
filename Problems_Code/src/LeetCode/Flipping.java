/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author DanielRoj
 */
public class Flipping {

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < A.length; i++) {

            int last = A[i].length - 1;

            for (int j = 0; j < A[i].length; j++) {

                if (last < j) {
                    break;
                }

                int memF = A[i][j];
                int memS = A[i][last];

                System.out.println("index 1 : " + memF + "Index 2: " + memS);
                A[i][j] = 1 - memS;
                A[i][last] = 1 - memF;

                last--;

            }

        }

        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {

            int last = A[i].length - 1;

            for (int j = 0; j < A[i].length; j++) {

                if (last < j) {
                    break;
                }

                int memF = A[i][j];
                int memS = A[i][last];
                
                A[i][j] = 1 - memS;
                A[i][last] = 1 - memF;

                last--;

            }

        }
        return A;
    }

}
