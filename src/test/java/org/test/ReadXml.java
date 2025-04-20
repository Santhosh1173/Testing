package org.test;

import java.io.File;
import java.util.List;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class ReadXml {
	
	public static void xmlRead() throws JAXBException {
		
		JAXBContext jb = JAXBContext.newInstance(empDetail.class);
		
		Unmarshaller um = jb.createUnmarshaller();
		
		File f= new File("C:\\Users\\Avinash\\eclipse-workspace\\MavenProject\\src\\test\\java\\empolyee.xml");
		
		Object ob = um.unmarshal(f);
		
		
		empDetail e=(empDetail)ob;
		List<Employee1> e1 = e.getEmployee1();
		System.out.println("--------sandy-------");
		Employee1 sandy= e1.get(0);
		
		System.out.println(sandy.getId());
		System.out.println(sandy.getName());
		System.out.println(sandy.getPhone());
		
		System.out.println("--------address-------");

		Address add = sandy.getAddress();
		
		System.out.println(add.getStreet());
		System.out.println(add.getCity());
		System.out.println(add.getState());
		System.out.println("--------mail-------");

		Mail m = sandy.getMail();
		System.out.println(m.getPersonal());
		System.out.println(m.getOffice());
		
	}
	
	public static void main(String[] args) throws JAXBException {
		xmlRead(); 
		
	}
	
	
	
	
	
	
	
	

}
