package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class TodayFortune implements FortuneService {
	
	// point to the file
	private String fileName = "C:\\Users\\Taiwo Adedapo\\eclipse-workspace\\spring-demo-annotaions\\src\\fortuneservice"; 
	
	// initialize array list
	private List<String> theFortunes;


	// create a random number generator
	private Random myRandom = new Random();
	
	public TodayFortune() {
		System.out.println(">> Inside the default constructor");;
	}

	@PostConstruct
	public void LoadFortuneFiles() {
		
		//instantiate the file
		File theFile = new File(fileName);
		
		// log file when seen
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
						new FileReader(theFile))) {

					String tempLine;

					while ((tempLine = br.readLine()) != null) {
						theFortunes.add(tempLine);
			}
					
				} catch (IOException e) {
					e.printStackTrace();
			}
		
		}
	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		int index = myRandom.nextInt(theFortunes.size());
		
		String stringTemp = theFortunes.get(index);
		
		return stringTemp;
	}

}
