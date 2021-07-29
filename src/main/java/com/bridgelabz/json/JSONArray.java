package com.bridgelabz.json;

import java.util.ArrayList;

import org.json.simple.JSONValue;

public class JSONArray {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("Atul");
		arr.add("India");
		arr.add("Maharastra");
		arr.add("Shirdi");
		String jsonText = JSONValue.toJSONString(arr);
		System.out.print(jsonText);
//		System.out.println(arr);
	}
}
