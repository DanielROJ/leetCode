package LeetCode;

import DataStuctures.ListNode;

public class SwapRecusirve {

	
	public static ListNode swapPairs(ListNode head) {
	  
	 ListNode tmp1 = head;
	 
	 head = head.next;
	 
	 head.next = tmp1;
	 
	 head.next.next = gol(tmp1.next.next);
	  
	 
	 return head;
	  
	  
	}
	
	private static ListNode gol(ListNode g) {
	
		if (g.next.next ==  null) {
			return g;
		}
		
		ListNode aux = g;
		
		g = g.next;
		
		g.next = aux;
		
		g.next.next = gol(aux.next.next);
		
		
		return g;
	
			}
	
	
	
	
	
	public static void main(String[] args) {
	
		ListNode x = new ListNode(1);
		
		
		
		for (int i = 2; i <= 5; i++) {
			
			x.add(i);
			
		}
		
	ListNode rel = swapPairs(x);   
	
	rel.PrintList();
	}
	
	
	
}
