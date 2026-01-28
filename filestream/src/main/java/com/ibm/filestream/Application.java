package com.ibm.filestream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application
{
	public static void main( String[] args )
	{
		short datatowrite=12345;
		try( DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("bfile.txt")))) {
			out.writeShort(datatowrite);
		}catch(Exception e) {
			
		}
		try(FileReader inputStream = new FileReader("file1.txt");
			FileWriter outputStream=new FileWriter("file2.txt")){
			int c;
			while((c=inputStream.read())!=-1) {
				outputStream.write(c); 
			}
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		try(FileInputStream in=new FileInputStream("file1.txt");
		 FileOutputStream out = new FileOutputStream("file2.txt");) {
			byte c;
			try {
				while((c=(byte) in.read())!=-1) {
					out.write(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}