/**
 * 
 */
package com.david.java.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;

public class FileMA {
	static String fileName = "D://ma.txt";
	static File fileDir = new File(fileName);

	public static void main(String[] args) throws IOException {
		// try {
		// FileReader fileReader = new FileReader("D://ma.txt");
		// char[] values = new char[100];
		// System.out.println(fileReader.read(values));
		// for(char c : values)
		// System.out.print(c); // prints the characters one by one
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
		int count = countLines(fileName);
		System.out.println("The count is " + count);
		readAttachedFile();
		String[] line = getContents(fileName);
		for (int i = 0; i < line.length; i++) {
			System.out.println(line.length);
		}
		System.out.println("line : " + line.toString());

		String lineValues = readLine(count, 2);
		System.out.println("The line values in the selected line is " + lineValues);
	}

	/**
	 * 
	 * To Read the attached file. (Unicode file UFT-8)
	 */
	public static void readAttachedFile() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
			in.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static int countLines(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
		InputStream is = new BufferedInputStream(new FileInputStream(filename));
		try {
			byte[] c = new byte[1024];
			int count = 0;
			int readChars = 0;
			boolean empty = true;
			while ((readChars = is.read(c)) != -1) {
				empty = false;
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n') {
						++count;
					}
				}
			}
			return (count == 0 && !empty) ? 1 : count;
		} finally {
			is.close();
		}
	}

	public static String readLine(int lineNumber, int j) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
		String line = null;
		for (int i = 0; i < j; i++) {
			if (j == lineNumber) {
				line = in.readLine();
			}
		}
		return line;
	}

	public static String[] getContents(String fileName2) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
		String string = in.readLine();
		System.out.println("string : " + string);
		try (LineNumberReader rdr = new LineNumberReader(new FileReader(fileName2))) {
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for (String line = null; (line = rdr.readLine()) != null;) {
				if (rdr.getLineNumber() >= 2) {
					sb2.append(line).append(File.pathSeparatorChar);
				} else if (rdr.getLineNumber() > 1) {
					sb1.append(line).append(File.pathSeparatorChar);
				}
			}
			return new String[] { sb1.toString(), sb2.toString() };
		}
	}

}