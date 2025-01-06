package ss6.exercise;

public class MainArrayList {
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();

		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		myArrayList.add(40);
		myArrayList.add(50);

		//b tra ve thong tin doi tuong
		System.out.println("Damh sach ban dau " + myArrayList.toString());

		//c them phan tu vao vi tri index
		myArrayList.add(3, 10);
		System.out.println("Damh sach sau khi them 10 vào vi tri 3: " + myArrayList.toString());

		//d thay the phan tu tai vi tri index
		myArrayList.thayThe(5, 20);
		System.out.println("Danh sach sau khi thay theô vi tri bang 5 la 3: " + myArrayList.toString());

		//e. tra ve phan tu tại vi tri index
		int elementAtIndex = myArrayList.traPhanTu(3);
		System.out.println("Phan tu tai vi tri thu 3 la: " + elementAtIndex);

		//f. lay ra phan tu vi tri phan tu tại vi tri index dau tien
		int elementToFind = 20;
		int indexOfElement = myArrayList.indexOf(elementToFind);
		if(indexOfElement != -1) {
			System.out.println("Vi tri index cua phan tu: " + elementToFind + "la: " + indexOfElement);
		} else {
			System.out.println("Khong tim thay phan tu" + elementToFind + "trong danh sach.");
		}

		//g. lay vi tri index phan tu cuoi cung
		int lastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
		if(lastIndexOfElement != -1) {
			System.out.println("Vi tri index cua phan tu: " + elementToFind + "la: " + lastIndexOfElement);
		}else {
			System.out.println("khoong tim thay phan tu" + elementToFind + "trong danh sach.");
		}
		//h xoa phan tu tai vi tri index
		myArrayList.remove(1);
		System.out.println("danh sach sau khi xoa phan tu dau tien: " + myArrayList.toString());

		//i xoa tat ca phan tu
		myArrayList.removeElement(20);
		System.out.println("Danh sach sau khi xoa cac phan tu co gia tri 20: " + myArrayList.toString());
	}
}