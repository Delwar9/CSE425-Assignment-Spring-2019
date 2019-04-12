package assignment;



import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class CSE425 {

	static Scanner input = new Scanner(System.in);

	
	public static void searchByCityName(String[][] array) {
		System.out.print("Enter City Name: ");
		String s = input.nextLine();
		for (int i = 0; i < array.length; i++) {
			if (array[i][0].toLowerCase().replace("\"", "").equals(s.toLowerCase())) {
				System.out.println(Arrays.toString(array[i]));
			}
		}

	}

	public static void searchByAirQuality(String[][] array) {
		String returnChoices = null;
		System.out.println("Enter Choices: (Press 1: Good, Press 2: Moderate)");
		int c = input.nextInt();
		if(c==1) {
			returnChoices = "Good";
		}
		else if(c==2) {
			returnChoices = "Moderate";
		}
		else {
			System.out.println("Invalid Input");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i][1].toLowerCase().replace("\"", "").equals(returnChoices.toLowerCase())) {
				System.out.println(Arrays.toString(array[i]));
				
			}
		}

	}
	
	
	
	public static void searchByO3Hour(String[][] array) {
		
		
		System.out.println("Enter O3 hours:");
		String s = input.nextLine();
		for (int i = 0; i < array.length; i++) {
			if (array[i][4].toLowerCase().replace("\"", "").equals(s.toLowerCase())) {
				System.out.println(Arrays.toString(array[i]));
			}
		}
		
	}
	
	public static void searchByO3Quality(String[][] array) {
		
		
		String returnChoices = null;
		System.out.println("Enter Choices: (Ex: 1 for Good, 2 for NA)");
		int c = input.nextInt();
		if(c==1) {
			returnChoices = "Good";
		}
		else if(c==2) {
			returnChoices = "NA";
		}
		else {
			System.out.println("Invalid Input");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i][5].toLowerCase().replace("\"", "").equals(returnChoices.toLowerCase())) {
				System.out.println(Arrays.toString(array[i]));
			}
		}
		
	}
	
	
	public static void searchByO3Value(String[][] array)  {
		
		
		System.out.println("Enter City Name:");
		String s = input.nextLine();
		
		
		System.out.println("Enter Date Time: (Ex: 1541027104)");
		String t = input.nextLine();
		
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			
			
			if (array[i][0].toLowerCase().replace("\"", "").equals(s.toLowerCase()) && 
					array[i][14].toLowerCase().replace("\"", "").equals((t.toLowerCase()))){
				
				System.out.println("The O3 value of the "+ s + " city is:: " +array[i][6]);
				
			}
			
		}
		
		
	}
	
	
	
	//N02 Part
	
	public static void searchByNO2Hour(String[][] array) {
		
		
		System.out.println("Enter NO2 hours:");
		String s = input.nextLine();
		for (int i = 0; i < array.length; i++) {
			if (array[i][7].toLowerCase().replace("\"", "").equals(s.toLowerCase())) {
				System.out.println(Arrays.toString(array[i]));
			}
		}
		
	}
	
	

	public static void searchByNO2Quality(String[][] array) {
		
		
		String returnChoices = null;
		System.out.println("Enter Choices: (Ex: 1 for Good, 2 for Moderate)");
		int c = input.nextInt();
		if(c==1) {
			returnChoices = "Good";
		}
		else if(c==2) {
			returnChoices = "Moderate";
		}
		else {
			System.out.println("Invalid Input");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i][8].toLowerCase().replace("\"", "").equals(returnChoices.toLowerCase())) {
				System.out.println(Arrays.toString(array[i]));
			}
		}
		
	}
	
	
public static void searchByNO2Value(String[][] array) throws ParseException {
		
		
		System.out.println("Enter City Name:");
		String s = input.nextLine();
		System.out.println("Enter Date Time: (Ex: 1541027104)");
		String t = input.nextLine();
		
		
		 
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i][0].toLowerCase().replace("\"", "").equals(s.toLowerCase()) && 
					array[i][14].toLowerCase().replace("\"", "").equals((t.toLowerCase()))){
				
				System.out.println("The NO2 value of the "+ s + " city is:: " +array[i][9]);
				
				
				
			}
			
		}
		
		
		
	}

//PM10 PART

public static void searchByPM10Hour(String[][] array) {
	
	
	System.out.println("Enter NO2 hours:");
	String s = input.nextLine();
	for (int i = 0; i < array.length; i++) {
		if (array[i][10].toLowerCase().replace("\"", "").equals(s.toLowerCase())) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
	
}



public static void searchByPM10Quality(String[][] array) {
	
	
	String returnChoices = null;
	System.out.println("Enter Choices: (Ex: 1 for Good, 2 for NA)");
	int c = input.nextInt();
	if(c==1) {
		returnChoices = "Good";
	}
	else if(c==2) {
		returnChoices = "NA";
	}
	else {
		System.out.println("Invalid Input");
	}
	for (int i = 0; i < array.length; i++) {
		if (array[i][11].toLowerCase().replace("\"", "").equals(returnChoices.toLowerCase())) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
	
}


public static void searchByPM10Value(String[][] array) throws ParseException {
	
	
	System.out.println("Enter City Name:");
	String s = input.nextLine();
	System.out.println("Enter Date Time: (Ex: 1541027104)");
	String t = input.nextLine();
	
	
	 
	
	for (int i = 0; i < array.length; i++) {
		
		if (array[i][0].toLowerCase().replace("\"", "").equals(s.toLowerCase()) && 
				array[i][14].toLowerCase().replace("\"", "").equals((t.toLowerCase()))){
				
			System.out.println("The PM10 value of the "+ s + " city is:: " +array[i][12]);
			
			
		}
		
	}
	

}

	
	
	


	public static void totalNumberOfAirByQuality(String[][] array) {
		
		
		
		System.out.println("Enter Choices: (Ex: Good,Moderate)");
		String s = input.nextLine();
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i][1].toLowerCase().replace("\"", "").equals(s)) {

				sum = sum + 1;
			}
		}

		System.out.println("Total number of air quality of choice " + s + " is:: " +sum);

	}
	
	

	public static void main(String[] args) throws ParseException {
		String fName = "C:\\Users\\delwa\\Desktop\\Spring-2019\\CSE425\\air_quality_Nov2017.csv"; 
		String temp;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataInputStream myInput = new DataInputStream(fis);

		List<String[]> lines = new ArrayList<String[]>();
		try {
			while ((temp = myInput.readLine()) != null) {
				
					lines.add(temp.split(","));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch blocks
			e.printStackTrace();
		}

		// convert our list to a String array.
		String[][] array = new String[lines.size()][0];
		lines.toArray(array);

		System.out.println("1. Search by City Name\n" + "2. Search Cities based on Air Quality\n" + "3. Search O3 Hour\n"
				+ "4. Search O3 Quality\n" + "5. Search O3 value of a particular city\n"
				+ "6. Search NO2 Hour\n" + "7. Search NO2 Quality\n" + "8. Search NO2 value of a particular city\n"
				+ "9. Search PM10 Hour\n " + "10. Search PM10 Quality\n"+ "11. Search PM10 value of a particular city\n"
				+ "12. Show Total number of a particluar Air Quality\n"
				);

		
		
		
		
				
	
		
		
		
			
			
       
        	System.out.println("Choose an Option: ");
        	String o = input.nextLine();
        	
        
        	
    		if (o.equals("1"))
    			searchByCityName(array);
    		else if (o.equals("2"))
    			searchByAirQuality(array);

    		else if (o.equals("3"))
    			searchByO3Hour(array);

    		else if (o.equals("4"))
    			searchByO3Quality(array);

    		else if (o.equals("5"))
    			searchByO3Value(array);

    		else if (o.equals("6"))
    			searchByNO2Hour(array);

    		else if (o.equals("7"))
    			searchByNO2Quality(array);

    		else if (o.equals("8"))
    			searchByNO2Value(array);
    		
    		else if (o.equals("9"))
    			searchByPM10Hour(array);
    		else if (o.equals("10"))
    			searchByPM10Quality(array);
    		else if (o.equals("11"))
    			searchByPM10Value(array);
    		else if (o.equals("12"))
    			totalNumberOfAirByQuality(array);
    		else
    			System.out.print("Invalid Input!");

			
        	

            
            
            
        

	}

}