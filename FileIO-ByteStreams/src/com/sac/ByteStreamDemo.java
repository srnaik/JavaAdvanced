package com.sac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	
	

	public static void main(String[] args) {
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream("D:\\sac.txt");
			fileOutputStream = new FileOutputStream("D:\\sac_new.txt");
			int a = 0;
			while((a = fileInputStream.read()) != -1){
				System.out.println(a);
				fileOutputStream.write(a);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fileInputStream != null || fileOutputStream != null){
				try {
					fileInputStream.close();
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
