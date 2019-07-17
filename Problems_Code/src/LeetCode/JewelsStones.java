/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Scanner;

/**
 *
 * @author droro
 */
public class JewelsStones {

    private static Scanner ent;

	public static int numJewelsInStones(String J, String S) {

        int count = 0;

        int iJ = 0;
        char[] arr = S.toCharArray();
        int iS = arr.length - 1;

        while (iJ < J.length()) {

            if (arr[iS] == J.charAt(iJ)) {
                count++;
                iS--;
            } else {
                iS--;
            }

            if (iS < 0) {
                iJ++;
                iS = arr.length - 1;
            }

        }

        return count;

    }

    public static void main(String[] args) {
        ent = new Scanner(System.in);

        String J = ent.next();
        String S = ent.next();

        System.out.println(numJewelsInStones(J, S));
    }

}
