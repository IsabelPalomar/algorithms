import java.util.Stack;


public class StackWithMinimum extends Stack<Node>{
    
	public static void main(String[] args) {
		StackWithMinimum stackMin =  new StackWithMinimum();
		stackMin.push(new Node(5));
		stackMin.push(new Node(4));
		stackMin.push(new Node(9));
		stackMin.push(new Node(1));
		stackMin.push(new Node(4));
		stackMin.push(new Node(1));
		stackMin.push(new Node(3));
		
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
		System.out.println(stackMin.getMin()+ ", value: " + stackMin.pop().value);
	}
    
	@Override
	public Node push(Node item) {
		int newMin = Math.min(item.value, getMin());
		
		item.setMin(newMin);
		return super.push(item);
	}
	public int getMin(){
		if (this.isEmpty())
			return Integer.MAX_VALUE;
		return peek().min;
	}
	
}

class Node {
	int min;
	Node next;
	int value;
	
	Node (int val){
		value = val;
	}
	
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
