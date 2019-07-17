/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


 */
package LeetCode;

/**
 *
 * @author DanielRoj 21/04/2019
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        try {
            return rec(nums, target, 0, 1);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            return null;
        }
    }

    private static int[] rec(int[] arr, int t, int posO, int posD) {
      //  System.out.println("Entro podO:" + posO + "y " + "PosD: " + posD);
        if (posD < arr.length && posO < arr.length) {

            int rel = arr[posO] + arr[posD];
           
            if (rel == t) {
                
             
                System.out.println(posO +" " +posD);
                int[] ok = new int[2];
                ok[0] = posO;
                ok[1] = posD;
                return ok;
                
            } else {

                int[] x = rec(arr, t, posO, posD + 1);
                if (x == null) {
                     int aux = posO + 1 ;
                    return rec(arr, t, posO + 1, aux);
                } else {
                    return x;
                }

            }

        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[400];
        for (int i = 0; i < arr.length; i++) {
            if(i== 200|| i == 300){
                arr[i] = 450;
            }else{
                arr[i]=(int) 0;
            }
        }
        
        
        System.out.println(arr.length);
        int[] a = twoSum(arr,900);
        for (int i : a) {
            System.out.println(i);
        }
        
        System.out.println("Total = "+arr[a[0]] +"+"+arr[a[1]]);
    }

}
