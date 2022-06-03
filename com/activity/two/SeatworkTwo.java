package com.activity.two.app;
import com.activity.two.Telephone;
import com.activity.two.Smartphone;

public class SeatworkTwo{

	public static void main(String args[]){

		//create a Telephone object which uses the method call()
		Telephone telephone = new Telephone();
		
		telephone.call("22811211");

		//Create a SmartPhone object constructed with a mobile phone number and OS
		Smartphone smartphone = new Smartphone("101001001", "Android Oreo");

		//get mobile phone's number and OS
		System.out.println(smartphone.getPhoneNo());
		System.out.println(smartphone.getOperatingSystem());

		//add at least 5 random contacts
		smartphone.addContact("John", "090889981");
		smartphone.addContact("Paulo", "120093821");
		smartphone.addContact("Chris", "128940911");
		smartphone.addContact("Ernesto", "100823012");
		smartphone.addContact("Eric", "857320114");

		//display all added contacts
		smartphone.displayContacts();

		//remove at least 1 contact
		smartphone.removeContact("Ernesto");

		//call at least 1 random phone number
		smartphone.call("000000000");

		//call at least 1 saved contact
		smartphone.call("Paulo",  "120093821");
	}
}