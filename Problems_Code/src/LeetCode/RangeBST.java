/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

 

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32

Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23


 */
package LeetCode;

/**
 *
 * @author droro
 */
public class RangeBST {

    int val;
    RangeBST left;
    RangeBST right;

    RangeBST(int x) {
        val = x;
    }

    public void add(int value) {
        if (value >= this.val) {

            if (this.right == null) {
                this.right = new RangeBST(value);
            } else {
                this.right.add(value);
            }

        } else {

            if (this.left == null) {
                this.left = new RangeBST(value);
            } else {
                this.left.add(value);
            }

        }
    }

    public int size() {

        if (this.right == null && this.left == null) {
            return 1;

        }

        if (this.right != null) {
            return this.right.size() + 1;
        } else {

            if (this.left != null) {
                return this.left.size() + 1;
            }
        }

        return this.right.size() + this.left.size() + 1;
    }

    public void totring() {

        if (this.left != null) {
            System.out.println(this.left.val);
            this.left.totring();
        }

        if (this.right != null) {
            System.out.println(this.right.val);
            this.right.totring();
        }

    }

    int count = 0;

    public void tmp(RangeBST root, int L, int R) {

        if (root.val >= L && root.val <= R) {
            
            count = count + root.val;
        }

        if (root.val <= R && root.right != null) {
            tmp(root.right, L, R);
        } 
        
        if (root.val >= L && root.left != null) {
                tmp(root.left, L, R);
        }
        

    }

    public int rangeSumBST(RangeBST root, int L, int R) {
       
        tmp(root, L, R);

        return count;

    }

}
