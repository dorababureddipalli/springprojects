package com.rootpack.bindings;

import java.io.FileOutputStream;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Tester {

	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("dorababu");
		s.setStudentRank(12);
		JAXBContext jacbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jacbContext.createMarshaller();
		// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		marshaller.marshal(s, new FileOutputStream("Student.xml"));
	}

}
