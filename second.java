
public class second
{
	public static void main(String[] args) 
	{
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(6);
		
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		
		Solution.addTwoNumbers(l1, l2);
	}

}
class ListNode 
{
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution
{
        public  static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
        {
	        int carry =0;
	        ListNode newHead = new ListNode(0);
	        ListNode p1 = l1, p2 = l2, p3=newHead;
	        while(p1 != null || p2 != null)
	        {
	            if(p1 != null)
	            {
	                carry += p1.val;
	                p1 = p1.next;
	            }
	            if(p2 != null)
	            {
	                carry += p2.val;
	                p2 = p2.next;
	            }
	            p3.next = new ListNode(carry%10);
	            p3 = p3.next;
	            carry /= 10;
	        }
	        if(carry==1)
	            p3.next=new ListNode(1);
	        return newHead.next;
        }
}