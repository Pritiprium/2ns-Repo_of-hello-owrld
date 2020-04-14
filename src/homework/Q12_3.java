package homework;
//Write a Java program to store text file content line by line into an array. 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Q12_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String fpath = "src\\homework\\hello-file.txt";
		String line ="";
		FileReader fr = new FileReader(fpath);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> array = new ArrayList<String>();
		while ((line = br.readLine()) !=null) {
			System.out.println(line);	
			array.add(line);
		}
		br.close();
		String dpath = "src\\homework\\documentarray.txt";
		FileWriter fw = new FileWriter(dpath,true);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0 ; i<array.size();i++)
		bw.write(array.get(i) +"\r\n");				
		bw.close();
	}

}
