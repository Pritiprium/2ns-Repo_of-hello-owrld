package HWDay11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Properties;

public class ReadnWritefile {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sLine;
		String spath = "src\\HWDay11\\readfileprac.txt";	
			FileReader fr = new FileReader(spath);
			BufferedReader br = new BufferedReader(fr);
			while ((sLine = br.readLine()) != null) {
				System.out.println(sLine);
			}	
		FileWriter fw = new FileWriter(spath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is new line writing at end");
			
			bw.close();
			fw.close();
			}	
		}



