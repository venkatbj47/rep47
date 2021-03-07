package pomPages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClsTestData 
{
	public static Object[][] getExcelData(String fPath) throws Exception
	{
		Object[][] ExcelData=null;

		XSSFWorkbook wb=new XSSFWorkbook(fPath);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rows=ws.getPhysicalNumberOfRows();

		ExcelData=new Object[rows][2];

		for(int i=0;i<rows;i++)
		{
			ExcelData[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
			ExcelData[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
		}

		return ExcelData;
	}

}
