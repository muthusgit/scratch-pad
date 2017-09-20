/*
* Project : DRE011 
* Date    : 24 Oct 2016
* Author  : Muthu Subramanian
*/

package practice;

/**
 * @author SubramanianM
 *
 */
public class Node {
	private Node next;
	private Object data;
	
	Node(Node next, Object data){
		this.next = next;
		this.data = data;
	}
	
	Node(Object data){
		this.data = data;
	}
	
	Node(){
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("Data : " + data + "  Next : " + next);			
		return "Data : " + data + "  Next : " + next;
	}
}
