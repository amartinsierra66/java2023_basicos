package principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {	
		FileReader f=null;
		BufferedReader bf=null;
		try {
			f=new FileReader("c:\\temp\\dias.txt");
			bf=new BufferedReader(f);
			/*String dia=bf.readLine();
			while(dia!=null) {
				System.out.println(dia);
				dia=bf.readLine();
			}*/
			String dia;
			while((dia=bf.readLine())!=null) {
				System.out.println(dia);
			}

		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(bf!=null) {
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(f!=null) {
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
