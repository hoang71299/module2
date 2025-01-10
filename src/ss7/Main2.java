package ss7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main2 {
	public static void main(String[] args) {
		File file = new File("src/ss7/datas/input.txt");
		try {
			FileReader files = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);

		}
		System.out.println("Chuong trinh ket thuc ko loi");
	}

}
