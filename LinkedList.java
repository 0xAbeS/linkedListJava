package linkedList2;


public class LinkedList {

  ListNode head;


  LinkedList() {
    head = new ListNode(null, null);

  }

  public ListNode addAValue(String line) {
	    ListNode temp = head;
	    ListNode prev = temp;
	    
	    if (temp.getValue() == null) {
	      temp.setValue(line);
	      return temp;
	    }
	    
	    if (line.compareTo((String)temp.getValue()) < 0) {
	    	ListNode x = new ListNode(line, temp);
	    	head = x;
	    	return head; 
	    }
	    
	    while (temp.getNext() != null) {
	    	if (temp.getValue() == null) {
	    	      temp.setValue(line);
	    	      return temp;
	    	    }
	    	
	    	if (line.compareTo((String)temp.getValue()) < 0) {
	    		ListNode x = new ListNode(line, temp);
	    		prev.setNext(x);
	    		return x;
	    	}
	    	prev = temp;
	    	temp = temp.getNext();
	    }
	    ListNode x = new ListNode(line, null);
	    temp.setNext(x);
	    return x;
	  }


  public ListNode deleteAValue(String line) {
    ListNode previousHead = head;
    ListNode next = head;
    ListNode valDeleted = head;
    while (next.getNext() != null) {
      if (next.getValue().equals(line)) {
        valDeleted = next;
        next = next.getNext();
        valDeleted.setNext(null);
        previousHead.setNext(next);
        break;
      }
    }

    return valDeleted;
  }

  public String showValues() {
    String allVals = "";
    ListNode temp = head;
    while (temp != null) {

      allVals += temp.getValue() + " ";
      temp = temp.getNext();
    }
    return allVals;
  }

  public void reverse() {
    ListNode temp1 = head;
    ListNode curNode = temp1;
    head = null;
    
    while (curNode.getNext() != null) {
      head = new ListNode(curNode.getValue(), head);
      curNode = curNode.getNext();
    }
    head = new ListNode(curNode.getValue(), head);
    curNode = curNode.getNext();
  }
  
  public void nReverse(int n) {
    LinkedList result = new LinkedList();
    LinkedList tempList = new LinkedList();
    ListNode curNode = getHead();
    int count = 0;

    
    while(curNode != null) {
    	count += 1;
    	tempList.addToEnd((String)curNode.getValue());
    	if(count == n) {
    		
    		tempList.reverse();
    		result.addToEnd(tempList);
    		tempList = new LinkedList();
    		count = 0;
    	}
    	curNode = curNode.getNext();
    }
    result.addToEnd(tempList);
    
    head = result.getHead();
  }

  private ListNode getLast(){
	  ListNode temp = head;
	  while(temp.getNext() != null) {
		  temp = temp.getNext();
	  }
	  return temp;
  }


  public void addToEnd(String line) {
	    
	    if (head.getValue() == null) {
	      head.setValue(line);
	    } else {
	    	getLast().setNext(new ListNode(line, null));
	    }
	    
	    }
  
  public void addToEnd(LinkedList values) {

	  if (head.getValue()== null) {
		  head = values.head;
	  } else {
		  getLast().setNext(values.head);
	  }
	  /*
	    if (head.getValue() == null) {
	    	head = value.getHead();
	    } else {
	    	
	    	ListNode temp = getLast();
	    	temp.setNext(line.getHead());
	    }
	    */
	  }
  
  public ListNode getHead() {
	  return head;
  }
  
  public void clear() {
    head.setNext(null);
    head.setValue(null);
  }
}