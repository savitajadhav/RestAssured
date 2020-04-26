package com.adweb.qa.data;
import org.apache.log4j.Logger;

import org.testng.Assert;


import com.adweb.qa.base.TestBase;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReuseableMethods {
	
	static Logger log = Logger.getLogger(ReuseableMethods.class);

	TestBase testBase;
	String baseUrl;
	String apiUrl;
	String url;

	public ReuseableMethods(){
		super();

	}
    //Convert Raw to JSON
	public static JsonPath rawToJSON(Response res) {
		String responseString = res.asString();
		// System.out.println(responseString);
		JsonPath m_js = new JsonPath(responseString);
		return m_js;

	}
	
   
	public static <T> void assertEquals(T actualString, T expectedString) {
	       
        try {
                 Assert.assertEquals(actualString, expectedString);
          log.info("Equal");
        } catch (AssertionError e) {
          log.error("Not Equal");
          throw e;
        }
        
      }
	    
	     
	   }
		
	
	
	/*@SuppressWarnings("deprecation")
	public ArrayList<String> readDataFromExcel(String testcasename) throws IOException {
		
		ArrayList <String> al = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("D:\\MobileAPIAutomation\\APIAutomation\\APIAutomation\\src\\main\\java\\com\\adweb\\qa\\data\\LoginRequestTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int noofsheets = workbook.getNumberOfSheets(); //Get Number of sheets
		for(int i=0;i<noofsheets;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
			       XSSFSheet sheet = workbook.getSheetAt(i); //Get specific sheet
			       Iterator<Row> rows = sheet.iterator(); //Get all rows of the sheet
			       Row firstrow = rows.next(); //Get first row
			       Iterator<Cell> cell = firstrow.cellIterator(); //Get cells of rows 
			       int k=0;
			       int column=0;
			       while(cell.hasNext()) {
			    	   Cell value = cell.next();
			    	   if(value.getStringCellValue().equalsIgnoreCase("Testcase")) {
			    		   column=k;
			    		   
			    		   
			    	   }
			    	   
			    	   k++;
			       }
			       //System.out.println(column);
			       while(rows.hasNext()) {
			    	   Row r = rows.next(); 
			    	   if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
			    		   
			    		   Iterator<Cell> cv = r.cellIterator();
			    		   while(cv.hasNext()) {
			    			   Cell c = cv.next();
			    			   if(c.getCellTypeEnum()==CellType.STRING) {
				    			   
			    				   al.add(c.getStringCellValue());

			    			   }
			    			   else {
			    				   al.add(NumberToTextConverter.toText(c.getNumericCellValue()));
			    			   }
			    		   }
			    	   }
			       }
			}
		}
		return al;
		
	}*/


