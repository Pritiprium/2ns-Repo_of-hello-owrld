package homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_write_permission {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fpath = "src\\homework\\hello-file.txt";		
		File nfile = new File(fpath);
		System.out.println("file created");
		FileWriter fw = new FileWriter(nfile,true);
		BufferedWriter bw = new BufferedWriter(fw);
		String ntext = "writing new sentence here";
		bw.write(ntext);
		System.out.println("permission to read and write");
		nfile.setReadable(true);
		nfile.setWritable(true);
		nfile.setExecutable(true);
		
		

	}

}
