package core;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jsonpckge.ReadJson;

public class Main {
	
	HandleLists handler = new HandleLists();
    char[] allowedInputs = {'a','b','c','d','e'};
    

	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	public static void main(String[] args) {
	
		Main hola = new Main();
		hola.init();
		
	}
	
	
	public void init() {
		
         char userInp = 'j';

        try
        {
            menu();
            while (userInp != 'e')
            {
                userInp = userInput();
                switch (userInp)
                {

                    case 'a':
                    	vehicleList = handler.parseVehiclesData();
                    	 System.out.println("Vehicle's data has been loaded correctly");
                        break;
                    case 'b':
                    	handler.parseStaffData();
                    	 System.out.println("Staff's data has been loaded correctly");
                        break;
                    case 'c':
                    	if(!vehicleList.isEmpty()) {
                    		printVehicleList();
                    	}
                   	 	System.out.println();
                    	//menu();
                        break;
                    case 'd':
                    	vehicleList.clear();
                    	vehicleList = handler.assignStaff();
                    	 System.out.println("Staff has been assigned");
                        break;
                    case 'e':
                            System.out.println("Program has been ended");
                        break;
                }
                    
            }
        }
        catch (Exception e)
        {
                System.out.println("Something went wrong. Please restart");
        }

	}

    char userInput() {
    
        boolean outOfLoop = false;
        char input = 0;
        Scanner log = new Scanner(System.in);
        
        while(outOfLoop==false){
        	
            input=log.next().toLowerCase().charAt(0);
            for(int i =0 ; i < allowedInputs.length; i++){ 
                if(allowedInputs[i] == input){
                    outOfLoop=true;
                }
            }
            if(outOfLoop==false) {
                System.out.println("\nWrong Keys. \n");
                menu();
            }
            
        }
        return input;
    }
	
    void menu() {
	    System.out.println("Press 'A' to get vehicle data");
	    System.out.println("Press 'B' to get staff data");
	    System.out.println("Press 'C' to assign available staff to vehicles");
	    System.out.println("Press 'D' to show vehicle data");
	    System.out.println("Press 'E' to finish");
    }
	
    void printVehicleList() {

        for(Vehicle vehicle: vehicleList){

            System.out.println("Type: "+vehicle.getVehicle_type());
            System.out.println("Id: "+vehicle.getIdentificador());
            System.out.println("Min. Consumption: "+vehicle.getMin_consumption());
            System.out.println("Actual loading: "+vehicle.getActual_loading());
            System.out.println("Max capacity: "+vehicle.getMax_capacity());
            System.out.println("Consuption per Km: "+vehicle.getConsumption_per_km());
            System.out.println("Median speed: "+vehicle.getMedian_speed());
            System.out.println("Crewman Id: "+vehicle.getCrewmanId());
            System.out.println("Crewman Name: "+vehicle.getCrewmanName());

            switch(vehicle.getVehicle_type()){
                case 'A':
                    System.out.println("N. of engines: "+((AirTypeV)vehicle).getNumberOfEngines());
                    System.out.println("Operating time: "+((AirTypeV)vehicle).getOperatingTime());
                    break;
                case 'L':
                    System.out.println("HorsePower: "+((LandTypeV)vehicle).getHorsePower());
                    System.out.println("N. of breakdowns: "+((LandTypeV)vehicle).getNumberOfBreakdows());
                    System.out.println("Price of breakdowns: "+((LandTypeV)vehicle).getPriceOfBreakdowns());
                    break;
                case 'T':
                    System.out.println("Lenght: "+((MaritimeTypeV)vehicle).getLenght());
                    System.out.println("Beam: "+((MaritimeTypeV)vehicle).getBeam());
                    System.out.println("Flotation date: "+((MaritimeTypeV)vehicle).getFlotationDate());
                    System.out.println("Date of manufacture: "+((MaritimeTypeV)vehicle).getDate0fManufacture());
                    break;
            }

            System.out.println("---------------------------------");
            System.out.println("---------------------------------");
        }
    }


}
