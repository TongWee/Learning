package file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Tong");
		if (!file.exists()) {
			System.out.println("File is Empty.");
		} else {
			File[] fileList = file.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				if (fileList[i].isDirectory())
					System.out.println(fileList[i].getName() + " is folder.");
				else
					System.out.println(fileList[i].getName() + " is file.");
			}
		}
	}

}
