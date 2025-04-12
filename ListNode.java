package linkedList2;

public class ListNode {

  private Object value;
  private ListNode next;


  public ListNode(Object initValue, ListNode initNext){
    value = initValue;
    next = initNext;
    return;
  }
  
  public ListNode() {
	  value = null;
	  next = null;
  }

  public Object getValue(){
    return value;
  }

  public ListNode getNext() {
    return next;
  }

  public void setValue(Object theNewValue){
    value = theNewValue;
  }

  public void setNext(ListNode theNewNext) {
    next = theNewNext;
  }
}