import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// idenify testcase column by scanning the enire its row
// once column is identified then can testcase column yo identify purchase testcase row
// after u grab testcase row -- pull all the vales 

public class dataDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C://Users//u//Desktop//Demodata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet= workbook.getSheetAt(i);
				
				// idenify testcase column by scanning the enire its row
			Iterator<Row>rows=	sheet.iterator();  // sheet collection of rows
			System.out.println("Rows Count"+rows);
		Row	firstrow=rows.next(); // 1st row TestCase	Data1	Data2	Data3
        Iterator<Cell>ce=firstrow.cellIterator(); //row is a collection of cell
        int k=0;
        int column = 0;
        while(ce.hasNext())
        {
        	Cell value=ce.next();
        	if(value.getStringCellValue().equalsIgnoreCase("Testdata"))
        	{
        		column=k;
        	}
        	k++;
        }
        System.out.println(column);
        
        
     // once column is identified then can testcase column yo identify purchase testcase row
        
				
			}
			
		}
		

	}

}
