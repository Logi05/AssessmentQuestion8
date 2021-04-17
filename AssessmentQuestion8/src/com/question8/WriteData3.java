package com.question8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteData3 {
	public static void main(String[] args) {
		File temp;
	      try
	      {
	         temp = File.createTempFile("myTempFile", ".txt");
	         System.out.println(temp);
	         System.out.println("File Created Successfully");

	         BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
	         bw.write("This is the temporary data written to temp file");	 
	         bw.close();
	         
	         try(BufferedReader br = new BufferedReader(new FileReader(temp))) {
             String line;
             while ((line = br.readLine()) != null) {
                 System.out.println(line);
             }
	         }
	      }

	      catch (IOException e) {
          e.printStackTrace();
       }
	}
}
