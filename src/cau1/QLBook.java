package cau1;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class QLBook {
	private ArrayList<Book> dsBook;

	public QLBook(ArrayList<Book> dsBook) {
		this.dsBook = dsBook;
	}

	public QLBook() {
		this.dsBook = new ArrayList<>();
		}

	public ArrayList<Book> getDsBook() {
		return dsBook;
	}

	public void setDsBook(ArrayList<Book> dsBook) seri{
		this.dsBook = dsBook;
	}

	public void inputBook(Book b) {
		this.dsBook.add(b);
	}

	public void hienThiBook() {
		for (Book b : dsBook) {
			System.out.println(b.toString());
		}
	}
	public void saveFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oo=new ObjectOutputStream(os); 
			for (Book b: dsBook) {
				oo.writeObject(b);
			}
			oo.flush();
			oo.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	public void readFile() {
//		File f2 = new File(C:\Users\Admin\eclipse-workspace\Java11\file.txt);
//		ArrayList <Book> dsBook = File.readAllLines(f2.toPath(), StandarCharsets.UTF_8);
//		for (Book b : dsBook) {
//			System.out.println(b);
//			
//		}
//	}
	public void readFile (){
		try {
			PrintWriter pw = new PrintWriter(C:\Users\Admin\eclipse-workspace\Java11\\book\file.txt);
			Book 
			pw.println("");
	}
		
		pw.flush();
		pw.close();
	 catch (Exception e) {
		e.printStackTrace();
	}
	}
}
