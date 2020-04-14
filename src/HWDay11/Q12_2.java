package HWDay11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q12_2 {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		String fpath = "src\\HWDay11\\readfilepractice.txt";
		String line = " ";
		FileReader fr = new FileReader(fpath);
		BufferedReader br = new BufferedReader(fr);
		while ((line = br.readLine())!=null) {
			System.out.println(line);
			
		}

	}

}
