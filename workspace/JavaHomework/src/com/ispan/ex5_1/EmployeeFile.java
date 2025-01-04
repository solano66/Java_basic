package com.ispan.ex5_1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeFile {

	public static void main(String[] args) {
//		Staff ex_PartTime = new PartTime("臨時工", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 195, 100);
//		Staff ex_Regular = new Regular("一般員工", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 30000, 2400);
//		Staff ex_Manager = new Manager("主管", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 40000, 2400, 10000, 3000);
//		Staff ex_SalesPerson = new SalesPerson("銷售員", "男", "2024/01/01", "0912345678", "abc123@gmail.com", 30000, 2400, 20000);
		
//		staffArray.add(ex_PartTime);
//		staffArray.add(ex_Regular);
//		staffArray.add(ex_Manager);
//		staffArray.add(ex_SalesPerson);
		List<Staff> staffArray = new ArrayList<>();
		String inputData;
		String[] inputDataArray = null;
		List<String[]> information = new ArrayList<>();
		
		
		try {
			File file = new File("C:\\java\\workspace\\homework\\src\\com\\ispan\\ex5_1\\test.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] data = new byte[bis.available()];
			bis.read(data);
			inputData = new String(data);
			inputDataArray = inputData.split("\\n");
			bis.close();
			fis.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
			
		for(int i=0; i<inputDataArray.length; i++) {
			information.add(inputDataArray[i].split(","));
		}

		for(int i=0; i<information.size(); i++) {
			switch(information.get(i)[0]) {
				case "0"-> staffArray.add(new PartTime(
						information.get(i)[1],
						information.get(i)[2],
						information.get(i)[3],
						information.get(i)[4],
						information.get(i)[5],
						Integer.parseInt(information.get(i)[6].trim()),
						Integer.parseInt(information.get(i)[7].trim())
						));
				case "1"-> staffArray.add(new Regular(
						information.get(i)[1],
						information.get(i)[2],
						information.get(i)[3],
						information.get(i)[4],
						information.get(i)[5],
						Integer.parseInt(information.get(i)[6].trim()),
						Integer.parseInt(information.get(i)[7].trim())
						));
				case "2"-> staffArray.add(new Manager(
						information.get(i)[1],
						information.get(i)[2],
						information.get(i)[3],
						information.get(i)[4],
						information.get(i)[5],
						Integer.parseInt(information.get(i)[6].trim()),
						Integer.parseInt(information.get(i)[7].trim()),
						Integer.parseInt(information.get(i)[8].trim()),
						Integer.parseInt(information.get(i)[9].trim())
						));
				case "3"-> staffArray.add(new SalesPerson(
						information.get(i)[1],
						information.get(i)[2],
						information.get(i)[3],
						information.get(i)[4],
						information.get(i)[5],
						Integer.parseInt(information.get(i)[6].trim()),
						Integer.parseInt(information.get(i)[7].trim()),
						Integer.parseInt(information.get(i)[8].trim())
						));
				
			}
		}
		System.out.println(staffArray);

	}

}
