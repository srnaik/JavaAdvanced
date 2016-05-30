package com.sac;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) {
		
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		
		try {
			
			fileReader = new FileReader("D:\\sac.txt");
			fileWriter = new FileWriter("D:\\sac_new.txt");
			
			int charStream = 0;
			
			while((charStream = fileReader.read()) != -1){
				System.out.println(charStream);
				fileWriter.write(charStream);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			if(fileReader != null || fileWriter != null){
				try {
					fileReader.close();
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		

	}

}
