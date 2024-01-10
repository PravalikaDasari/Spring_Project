package com.feuji.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.feuji.beans.Candidate;

@Controller
public class FeujiApplicationController {
	private static Logger logger = LoggerFactory.getLogger(FeujiApplicationController.class);

	@RequestMapping(path = "/loginForm", method = RequestMethod.GET) // it is just url pattern
	public ModelAndView fillApplication(ModelMap map) {
//		Map<String, String> map = new HashMap<>();
		map.put("headerName", "Feuji Solutions");
		return new ModelAndView("loginForm", "login", new Candidate());
	}

	@RequestMapping(path = "/loginForm", method = RequestMethod.POST)
	public ModelAndView fillApplication2(@ModelAttribute(name = "login") Candidate candidate) {
		logger.info(candidate.toString());
//		try {
//			store(candidate);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println("candidate details: " + candidate);

//		extract();

		return new ModelAndView("loginForm", "login", candidate);
	}

//	public static void extract() {
//		System.out.println("extract() started");
//		FileInputStream inputStream = null;
//		Workbook workbook = null;
//		try {
//			inputStream = new FileInputStream("C:\\Users\\Welcome\\Desktop\\ppt\\storeDetails2.xlsx");
//			workbook = new XSSFWorkbook(inputStream);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		Sheet sheet = workbook.getSheet("storeDetails2.xlsx");
//
//		Row row = sheet.getRow(1); // Row 0 is the first row
//
//		Cell id = row.getCell(0); // Column 0 is the first column
//		String Id = id.getStringCellValue();
//		Cell name = row.getCell(1); // Column 0 is the first column
//		String Name = name.getStringCellValue();
//		Cell gender = row.getCell(2); // Column 0 is the first column
//		String Gender = gender.getStringCellValue();
//
//		System.out.println(Id + " " + Name + " " + Gender);
//	}

//	public static void store(Candidate candidate) throws IOException {
//		System.err.println("store method started");
//		// Example: Create a new XSSFWorkbook for reading
//		FileInputStream inputStream = null;
//		Workbook workbook = null;
//		try {
//			inputStream = new FileInputStream("C:\\Users\\Welcome\\Desktop\\ppt\\storeDetails2.xlsx");
//			workbook = new XSSFWorkbook(inputStream);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		Sheet sheet = workbook.createSheet("storeDetails2.xlsx");
//
//		Row row2 = sheet.createRow(0);
//		Cell cel21 = row2.createCell(0);
//		cel21.setCellValue("id");
//
//		Cell name = row2.createCell(1);
//		name.setCellValue("Name");
//
//		Cell gender = row2.createCell(2);
//		gender.setCellValue("Gender");
//
//		Row row = sheet.createRow(1); // Row 0 is the first row
//
//		Cell cell1 = row.createCell(0); // Column 0 is the first column
//		cell1.setCellValue(candidate.getRefId());
//
//		Cell cell2 = row.createCell(1); // Column 1 is the second column
//		cell2.setCellValue(candidate.getName());
//
//		Cell cell3 = row.createCell(2); // Column 0 is the first column
//		cell3.setCellValue(candidate.getGender());
//
//		// Example: Save the workbook to a file
//		FileOutputStream outputStream;
//		try {
//			outputStream = new FileOutputStream("C:\\Users\\Welcome\\Desktop\\ppt\\storeDetails2.xlsx");
//			workbook.write(outputStream);
//			workbook.close();
//			outputStream.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.err.println("store method ended");
//
//	}
}
