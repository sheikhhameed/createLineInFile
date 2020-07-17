package com.read.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GetNoOfLines {

	public static int getNoOfFiles(int x) throws IOException {
		System.out.println("input No Of Lines: "+x);
		int val=0;
		String text="a";
		int c =0; 
		System.out.println(c);
		String[] ch = new String[5]; 
		File file = new File("e:\\file1.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter writer = new FileWriter(file);
		for(int i=0;i<x;i++) {
//			writer.write(text);		
			
			for(int j=0;j<ch.length;j++) {
				ch[j]=text;	
//				System.out.println("j: "+j);
				writer.write(ch[j]);		
			}
			writer.write("\n");
		}
		writer.close();
val=1;
		return val;
	}
	
	public static void main(String[] args) {
		int result = 0 ;
		try {
			result=getNoOfFiles(2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done!!"+result);
	}

}
