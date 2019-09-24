package test.practise.littleAdvance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOProg {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		FileReader FR = new FileReader("D:\\JWorkspace\\FileIo.txt");
		BufferedReader BR = new BufferedReader(FR);
		int i;
		while ((i = BR.read()) != -1) {
			System.out.print((char) i);
		}
		BR.close();
		FR.close();

		File file = new File("D:\\JWorkspace\\TestIo.txt");
		FileWriter Fw = null;
		Fw = new FileWriter(file);
		String content = "This file is created by Java";

		if (file.canWrite()) {
			System.out.println("Yes, we can write ");
		} else
			System.out.println("No, we can not");
		Fw.write(content);
		System.out.println("\n Done");
		Fw.flush();
		Fw.close();

	}
}