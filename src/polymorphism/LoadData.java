package polymorphism;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LoadData {
		
	public static final int COLUMN_NUM = 7;//the column of the text file
    static ArrayList<String[]> lineList = new ArrayList<String[]>();// ArrayList used to store the row of csv file
    
    
    //read the exact txt file data and return ArrayList
    public static void getTXTData() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("VehicleInfo"));
        String line = "";
        // Read a single line from the file until there are no more lines to read
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ","); // using , to despite the content
            String[] currCol = new String[COLUMN_NUM]; // Each currCol has 5 fields
            int i = 0;
            while (st.hasMoreTokens()) {
            	currCol[i++] = st.nextToken();
            }

            lineList.add(currCol);
           
        }
        br.close();
    }
    
    public static ArrayList<String[]> getLineList() throws IOException { //clear linelist for new start
        lineList.clear();
        getTXTData();
        System.out.println(lineList);
        return lineList;
    }

}
