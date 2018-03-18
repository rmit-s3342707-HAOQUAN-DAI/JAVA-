package polymorphism;

import static polymorphism.LoadData.COLUMN_NUM;

import java.io.IOException;
import java.util.ArrayList;

public class Saloon extends Vehicle{
	
	public static ArrayList<String[]> saloonInfo = new ArrayList<String[]>();
	
	public Saloon(String vehicleType, int year, String price, String model, String color) {
		super(vehicleType, year, price, model, color);
		// TODO Auto-generated constructor stub
	}

	
	 public static void readSaloonData() throws IOException {

	        ArrayList<String[]> tempOf = LoadData.getLineList();

	        for (int i = 0; i < tempOf.size(); i++) {
	            if (tempOf.get(i)[1].equals("SALOON")) {
	                String[] currCol = new String[COLUMN_NUM];
	                for (int n = 0; n < COLUMN_NUM; n++) {
	                    currCol[n] = tempOf.get(i)[COLUMN_NUM + n - 5];
	                }
	                saloonInfo.add(currCol);
	            }
	        }
	    }
	 
	    public static ArrayList<String[]> getSaloonList() throws IOException {
	        saloonInfo.clear();
	        readSaloonData();
	        return saloonInfo;
	    }

	    public static void setSaloon(ArrayList<String[]> saloon) {
	        Saloon.saloonInfo = saloon;
	    }
	
}
