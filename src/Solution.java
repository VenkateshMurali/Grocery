import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dummy.Employee;

public class Solution {
	public static void main(String args[]) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter NAME:");
		String name = bf.readLine();
		System.out.println("Enter EMail_ID:");
		String emailId = bf.readLine();
		System.out.println("Enter Ph_NO::");
		long phone = Long.valueOf(bf.readLine());
		System.out.println("Enter HouseRentAllowance");
		float houseRentAllowance = Float.valueOf(bf.readLine());
		System.out.println("Enter TravelAllowance");
		float travelAllowance = Float.valueOf(bf.readLine());
		System.out.println("Enter DearnessAllowance");
		float dearnessAllowance = Float.valueOf(bf.readLine());
		System.out.println("EnterProvidentFund");
		float providentFund = Float.valueOf(bf.readLine());
		System.out.println("Enter BAsicSalary");
		float basicSalary = Float.valueOf(bf.readLine());
		Employee emp = new Employee( name,emailId, phone, houseRentAllowance, travelAllowance, dearnessAllowance, providentFund, basicSalary);
		System.out.println("Name:" + emp.getName());
		System.out.println("Email:" + emp.getEmailId());
		System.out.println("Phone:" + emp.getPhone());
		System.out.println("HRA:" + emp.getHouseRentAllowance());
		System.out.println("TA:" + emp.getTravelAllowance());
		System.out.println("DEARNESS_A:" + emp.getDearnessAllowance());
		System.out.println("PF:" + emp.getProvidentFund());
		System.out.println("BASIC_SALARY:" + emp.getBasicSalary());
		
		session.save(emp);
		session.getTransaction().commit();

		session.close();
	}

}