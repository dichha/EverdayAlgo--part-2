/* Singly linked ListNode class definition */
class ListNode{
	int val; 
	ListNode next; 
	ListNode(int val){
		this.val = val;
	}
	public int getData(){
		return this.val; 
	}
	public ListNode getNext(){
		return this.next;
	}
	public void setData(int val){
		this.val = val;
	}
	public void setNext(ListNode next){
		this.next = next; 
	}

}

public class MergeLinkedList{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null)
			return l2; 
		if(l2 == null)
			return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}

	}
	public static void main(String[] args){
		MergeLinkedList mll = new MergeLinkedList(); 
		ListNode l1_0 = new ListNode(1); 
		ListNode l1_1 = new ListNode(13); 
		ListNode l1_2 = new ListNode(14); 
		l1_0.setNext(l1_1); 
		l1_1.setNext(l1_2);
		ListNode l2_0 = new ListNode(-1);
		ListNode l2_1 = new ListNode(2); 
		l2_0.setNext(l2_1);

		ListNode mergedList = mll.mergeTwoLists(l1_0, l2_0);
		while(mergedList != null){
			System.out.print(mergedList.val + " ");
			mergedList = mergedList.next; 

		}
	}

}
