package demo;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Jxl_WriteData {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("E:\\Practice\\Excel\\Results.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet ws=wwb.createSheet("Output", 0);
		Label l=new Label(0,0,"Selenium");
		ws.addCell(l);
		Label l1=new Label(0,1,"Java");
		ws.addCell(l1);
		wwb.write();
		wwb.close();
		

	}

}
