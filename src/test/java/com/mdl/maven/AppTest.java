package com.mdl.maven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppTest {
	
	

	public static void main(String[] args) {
		String sourcePath = "d:" + File.separator + "sql"+ File.separator + "ErpScrap.java";
		String targetPath = "d:" + File.separator + "sql"+ File.separator + "ErpScrap2.java";
		String key="type,category,store";
		

		
		modify(key,sourcePath, targetPath);
		
	}

	public static void modify(String key,String sourcePath,String targetPath) {
		String[] keys=key.split(",");
		
		try {
			// read file content from file
			StringBuffer sb = new StringBuffer("");

			FileReader reader = new FileReader(sourcePath);
			BufferedReader br = new BufferedReader(reader);

			String str = null;

			while ((str = br.readLine()) != null) {
				
				for (int i = 0; i < keys.length; i++) {
					if(!str.contains(keys[i]) && !str.contains(" "+keys[i]+";")){
					}
				}
				sb.append(str + "\r\n");
				System.out.println(str);
				
			}

			br.close();
			reader.close();

			// write string to file
			FileWriter writer = new FileWriter(targetPath);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(sb.toString());

			bw.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
