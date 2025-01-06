package ss6.exercise;

public class MyArrayList {
	private int capacity;

	private int[] arr;

	private int size;

	private int size() {
		return size;
	}

	private int[]  emptyArray = {};

	public MyArrayList() {
		arr = emptyArray;
	}

	public MyArrayList(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	// them phan tu vao cuoi
	public void add(int element) {
		if (arr == emptyArray) {
			this.capacity = 10;
			this.arr = emptyArray;
		}

		if(size == capacity) {
			this.capacity *= 1.5;
			if(size == capacity) {
				capacity++;
			}

			int[] arr2 = new int[this.capacity];

			// copy phan tu
			for(int i = 0; i < size; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
		}
		arr[size] = element;
		size++;
	}
	//b. tra ve thong tin doi tuong

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < size; i++) {
			sb.append(arr[i]).append(" ");
		}
		return sb.toString();
	}

	// c. add phan tu vao vi tri index
	public void add(int index, int element) {
		if(index < 0 || index > size) {
			System.out.println("Khong hop le !!");
			return;
		}
		if(size == capacity) {
			this.capacity *= 1.5;
			if(size == capacity) {
				capacity++;
			}
			int [] arr2 = new int[capacity];

			for(int i = 0; i < size; i++) {
				arr2[i] = arr[i];
			}
			arr2[index] = element;

			for(int i = index; i < size; i++) {
				arr2[i + 1] = arr[i];
			}
			arr = arr2;
		} else {
			for (int i = size; i > index ; i--) {
				arr[i] = arr[i - 1];
			}
			arr[index] = element;
		}
		size++;
	}
	// d. thay the vi tri tai phan tu index
	public void thayThe(int index, int element) {
		if(index < 0 || index > size) {
			System.out.println("Khong hop le !!");
			return;
		}
		arr[index] = element;
	}

	// e. tra ve phan tu tai index
	public Integer traPhanTu(int index) {
		if(index < 0 || index > size) {
			System.out.println("Khong hop le !!");
			return null;
		}
		return arr[index];
	}

	// f. lay vi tri index phan tu dau tien tim thay
	public int indexOf(int element) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// g. lay vi tri index phan tu cuoi cung dau tien tim thay
	public int lastIndexOf(int element) {
		for(int i = size - 1; i >= 0; i--) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// h. xoá phan tu tai vi tri index
	public void remove(int index) {
		if(index < 0 || index > size) {
			System.out.println("Khong hop le !!");
			return;
		}
		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	// i. xoa tat ca phan tu element
	public void removeElement(int element) {
		int newIndex = 0;
		for(int i = 0; i < size; i++) {
			if(arr[i] != element) {
				arr[newIndex] = arr[i];
				newIndex++;
			}
		}
		size = newIndex;
	}
}