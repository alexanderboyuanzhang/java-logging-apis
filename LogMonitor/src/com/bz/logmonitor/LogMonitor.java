package com.bz.logmonitor;

import java.io.BufferedReader;
import java.io.FileReader;

public class LogMonitor {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/tmp/logSample/test.log");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();
			if (line == null) {
				System.out.println("Sleeping... ");
				Thread.sleep(1 * 1000);
			} else {
				System.out.println("Start: ");
				System.out.println(line);
			}
		}
	}
}