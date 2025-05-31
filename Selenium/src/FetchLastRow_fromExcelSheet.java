import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchLastRow_fromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\PracticeWorkspace\\Selenium\\testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh =book.getSheet("Sheet1")
				;
		int lastrow =sh.getLastRowNum();
		System.out.println(lastrow);
		
		short lastcell = sh.getRow(2).getLastCellNum();
		System.out.println(lastcell);
		
	}

}
