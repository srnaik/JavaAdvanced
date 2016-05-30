package com.sac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args){

		Employee employee = new Employee();

		employee.setAddress("1600 Space Center Blvd");
		employee.setName("Sachin");
		employee.setNumber(890009879);
		employee.setSSN(1678);

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {

			fileOutputStream = new FileOutputStream("D://Object_Srialization.ser");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
