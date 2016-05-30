package com.sac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) {
		
		Employee employee = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("D://Object_Srialization.ser");
			objectInputStream = new ObjectInputStream(fileInputStream);
			employee = (Employee) objectInputStream.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		if(employee != null){
			System.out.println("Deserialized object is ");
			System.out.println(employee);
		}else{
			System.out.println("Object not Found !");
		}
		

	}

}
