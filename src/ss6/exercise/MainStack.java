package ss6.exercise;


public class MainStack {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<>();

		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);

		System.out.println("ngan xep " + myStack.toString());

		Integer peek = myStack.peek();
		System.out.println("Gia tri dau o ngan xep " + peek);

		Integer pop = myStack.pop();
		System.out.println("Gia tri lay ra ngan xep " + pop);

		boolean isEmpty = myStack.isEmpty();
		System.out.println("ngan xep co rong khong " + isEmpty);

		int size = myStack.size();
		System.out.println("kich thuoc ngan xep: " + size);

	}
}