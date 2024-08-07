package aa.aa1.WebTests;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		System.out.println("Try programiz.pro");
		List<Addresses> addresses = new ArrayList<Addresses>();
		addresses.add(new Addresses("line1","line2","line3"));
		addresses.add(new Addresses("Addline1","Addline2","Addline3"));


		Customer customer = new Customer(1,"Chris","Wood",addresses);
		System.out.println(customer);
		System.out.println(customer.getAddresses());

		List<Addresses> aa=customer.getAddresses();  
		System.out.println(aa.get(0).getLine1());

		CustomerData customerdata = new CustomerData();
		customerdata.setfname("GLaurenUpdate");

		Customer customer2 = new Customer(customerdata);
		System.out.println(customer2.getfname());
		System.out.println(customer2.getid());

		}

}
