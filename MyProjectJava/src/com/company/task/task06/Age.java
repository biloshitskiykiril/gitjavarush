package com.company;
import java.io.BufferedReader;
public class Age{
	public void age(BufferedReader reader)throws Exception{
		double b = 1.0;
		int count = 0;
		while(true){
			int a = Integer.parseInt(reader.readLine());
			count++;
			System.out.println(count+","+b);
			if(a==-1){

				System.out.print((b-1)/(count-1));
				break;
			}

			b+=(double)a;
		System.out.println(count+","+b);
		}
	}
}