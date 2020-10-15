package com.company.task.task06;
import com.company.task.task06.Age;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class AppTest{
	public static void main(String[]args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Age age1 = new Age();
		age1.age(reader);
	}
}