package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.attribute.AclEntry.Builder;

public class Test {

	public static void main(String[] args) {
		Book book = new Book.Builder(1001, "万物简史").author("佚名").build();
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("book.out");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(book);
			oos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("book.out");
			ois = new ObjectInputStream(fis);
			Book inputBook = (Book) ois.readObject();
			System.out.println("ID : " + inputBook.getId());
			System.out.println("Name : " + inputBook.getName());
			System.out.println("Author : " + inputBook.getAuthor());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
