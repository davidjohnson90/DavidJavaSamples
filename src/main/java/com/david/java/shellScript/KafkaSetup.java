package com.david.java.shellScript;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KafkaSetup {

	public static void main(String[] args) {
		KafkaSetup kafkaSetup = new KafkaSetup();
		// in windows
		String changeDirectory = "D:";
		String goToKafka = "cd Google\\SourceCode\\kafka_2.10-0.8.2.1";
		String startZookeeper = "bin\\windows\\zookeeper-server-start.bat config\\zookeeper.properties &";
		// String
		kafkaSetup.executeCommand(changeDirectory);
		kafkaSetup.executeCommand(goToKafka);
		String output = kafkaSetup.executeCommand(startZookeeper);
		System.out.println(output);
	}

	private String executeCommand(String command) {
		System.out.println("am in execute method");
		StringBuffer output = new StringBuffer();
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			System.out.println("p is executed");
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(output.toString());
		return output.toString();
	}
}
