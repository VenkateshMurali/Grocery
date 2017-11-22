import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.grovery.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class result1 {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		session.beginTransaction();
		Item item = new Item();
		item.setId(0);
		session.delete(item);
		//Item item = session.get(Item.class, 0);
		//System.out.println(item.getId());
		//System.out.println(item.getName());
		//System.out.println(item.getPrice());
		//System.out.println(item.getQuantity());
		
		//item.setName("Paste");
		//item.setPrice(145);
		//session.update(item);
		session.getTransaction().commit();
		System.out.println("Deleted");
	}
}



