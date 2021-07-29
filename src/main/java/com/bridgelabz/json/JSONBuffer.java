package com.bridgelabz.json;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class JSONBuffer {
	public class BufferedInputStreamExample {
		public void main(String args[]) {
			try {
				FileInputStream fis = new FileInputStream("C:\\Users\\Atul Gaikar\\OneDrive\\Desktop\\Atul.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				int i;
				while ((i = bis.read()) != -1) {
					System.out.print((char) i);
				}
				fis.close();
				bis.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
