package com.bridgelabz.json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

public class JSONMap {
	public static void main(String[] args) {
		Map obj = new HashMap();
		obj.put("Id", 1);
		obj.put("Name", "Atul");
		obj.put("Country", "India");
		obj.put("State", "Maharastra");
		obj.put("Address", "Shirdi");
		String jsonText = JSONValue.toJSONString(obj);
		System.out.print(jsonText);
	}
}
