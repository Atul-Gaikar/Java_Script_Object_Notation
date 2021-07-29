package com.bridgelabz.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemo {
	public static void main(String args[]) {
		JSONObject obj1 = new JSONObject();
		obj1.put("name", "atul");
		obj1.put("address", "shirdi");

		JSONObject obj2 = new JSONObject();
		obj2.put("name", "bridgelabz");
		obj2.put("address", "mumbai");

		JSONArray arr = new JSONArray();
		arr.put(obj1);
		arr.put(obj2);
		try (FileWriter file = new FileWriter("C:\\Users\\Atul Gaikar\\OneDrive\\Desktop\\Atul1.json")) {
			file.write(arr.toString());
		} catch (IOException exception) {
			exception.printStackTrace();
		}

		try {
			FileReader input = new FileReader("C:\\Users\\Atul Gaikar\\OneDrive\\Desktop\\Atul1.json");
			int i = 0;
			while ((i = input.read()) != -1) {
				System.out.print((char) i);
			}
			input.read();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(obj1);
		System.out.println(obj2);
	}
}
