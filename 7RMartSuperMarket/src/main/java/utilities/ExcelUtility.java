package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

import java.io.FileInputStream;

public class ExcelUtility {

	static FileInputStream f;// used to input file
	static XSSFWorkbook w; // used to input workbook from file
	static XSSFSheet s; // usee to input excel sheet

	public static String getStringData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream(Constant.TESTDATA);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
	}

	public static int getIntegerData(int a, int b, String sheet) throws IOException {
		f = new FileInputStream(Constant.TESTDATA);
		w = new XSSFWorkbook(f);
		s = w.getSheet(sheet);
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);
		// type casting conversion data from one datatype to another default double to
		// int
		int x = (int) c.getNumericCellValue();
		return x;
	}

}
