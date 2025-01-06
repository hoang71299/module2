package ss6.exercise;

public class MainQueue {
	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<>();

		//a
		myQueue.add(10);
		myQueue.add(20);
		myQueue.add(30);

		System.out.println("Hang doi:" + myQueue.toString());

		//b lay ra phan tu dau tien
		Integer peekValue = myQueue.peek();
		System.out.println("Giá trị ở đầu hàng đợi " + peekValue);

		//c lay ra va xoa phan tu dau tien
		Integer pollValue = myQueue.poll();
		System.out.println("Giá trị lấy ra: " + pollValue);

		// d kiem tra xem hang doi co rong khong
		boolean isEmpty = myQueue.isEmpty();
		System.out.println("Hang doi co trong khong : " + isEmpty);

		// e lay ra kich thuoc hang doi
		int myQueueSize = myQueue.size();
		System.out.println("Kich thuoc cua hang doi la: " + myQueueSize);

	}
}
