class ListNode{
	int val;
	ListNode next; 
	ListNode(int val){
		this.val = val;
	}
}
public class RemoveDuplicatesSortedList{
	RemoveDuplicatesSortedList(){};
	public ListNode removeDuplicates(ListNode head){
		ListNode cursor = head;
		while(cursor != null){
			if(cursor.next == null)
				break;
			
			if(cursor.val == cursor.next.val)
				cursor.next = cursor.next.next; 
			else
				cursor = cursor.next; 
		}
		return head; 
	}
	public static void main(String[] args){
		RemoveDuplicatesSortedList rdsl = new RemoveDuplicatesSortedList();

	}
}