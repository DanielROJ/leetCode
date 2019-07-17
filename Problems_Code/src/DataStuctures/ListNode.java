/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStuctures;

/**
 *
 * @author droro
 */
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public boolean add(int val) {
		try {

			if (this.next == null) {
				this.next = new ListNode(val);
				return true;
			} else {

				return this.next.add(val);

			}

		} catch (Exception e) {
			return false;
			// TODO: handle exception
		}

	}

	public void PrintList() {

		System.out.println(this.val);

		if (this.next != null) {
			this.next.PrintList();
		}

	}

}
