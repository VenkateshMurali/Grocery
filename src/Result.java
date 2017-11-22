import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.isbn.bk.Book;;

public class Result {
	public static void main(String args[]) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name = bf.readLine();
		System.out.println("Enter Publisher");
		String publisher = bf.readLine();
		System.out.println("Enter Author");
		String author = bf.readLine();
		System.out.println("Enter prize");
		double prize = Double.valueOf(bf.readLine());
		System.out.println("Enter published");
		//Date published = new Date(bf.readLine());
		System.out.println("Enter ISBN NO:");
		String isbn_no = bf.readLine();
		//Book bk = new 
	}
}
