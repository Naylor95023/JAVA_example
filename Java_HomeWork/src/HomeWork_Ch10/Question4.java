package HomeWork_Ch10;

/*
 * 以附加模式寫入1~1000亂數十個
 * 再讀出來
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question4 {

	public static void main(String[] args) {
		//把檔案寫入
		try(FileWriter fw = new FileWriter("D:\\DataR.txt",true);
			BufferedWriter	bw = new BufferedWriter(fw);
			){
				for(int i = 0; i < 10; i++){
					int r = (int) (Math.random() * 1001);
					//System.out.println(r);
					bw.write(r + "\n");
				}
				bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound");
		} catch (IOException e) {
			System.out.println("IOException");
		} 		
		
		
		//讀檔
		
			try(FileReader fr = new FileReader("D:\\DataR.txt");
				BufferedReader br = new BufferedReader(fr);
			){
				String str;
		        while ((str = br.readLine()) != null) {
		           System.out.println(str);
		        }
			}
			//例外離開
			catch (EOFException e) {
				System.out.println("EOF");
				//break;
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFound");
			} catch (IOException e) {
				System.out.println("IOException");
			} 	

	}

}
