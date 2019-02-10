package core;

import java.util.ArrayList;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import jsonpckge.ReadJson;

public class HandleLists {


	ArrayList<Staff> staffList = new ArrayList<>();
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	Staff hello;
	Optional<Vehicle> vehicle; // Optional is a certain container for the object

   public ArrayList<Vehicle> assignStaff() {

       for(Staff staffMember : staffList) {

           char staffSpecialization = staffMember.getSpecialization().charAt(0);
           	
           // Gets first vehicle that equals with staff specialization
           vehicle = vehicleList.stream()
			            .filter(vehicle -> (vehicle.getVehicle_type() == staffSpecialization)&&vehicle.getCrewmanId() == null)
			            .findFirst();
           
           vehicle.get().setCrewmanName(staffMember.getName());
           vehicle.get().setCrewmanId(staffMember.getId());
           
        }
       
       return vehicleList;

   } 


   public ArrayList<Staff> parseStaffData() {
		
		String pplData = "jsonpckge/personalData.json";
		
		JSONObject staffJsonObj = ReadJson.getFileAndParseToJsonObj(pplData);
		
		try{
			
			JSONArray arrayData = (JSONArray)staffJsonObj.get("staff");
			
			for(int i = 0; i < arrayData.size() ; i++) { 
			
				JSONObject sMember = (JSONObject)arrayData.get(i);
				String nif = (String)sMember.get("id");
				String name = (String)sMember.get("name");
				String born_date = (String)sMember.get("born_date");
				String specialization = (String)sMember.get("specialization");
				Boolean assigned = (Boolean)sMember.get("assigned");
				
				staffList.add(new Staff(nif, name, born_date, specialization, assigned));			
			}
			return staffList;
						
		} catch(Exception e){
			
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Vehicle> parseVehiclesData() {																																																							
		
        String vehiclesData = "jsonpckge/vehiclesData.json";
        
        JSONObject vehiclesJsonObj = ReadJson.getFileAndParseToJsonObj(vehiclesData);
    
        try{
            
            JSONArray arrayData = (JSONArray)vehiclesJsonObj.get("vehicles");
            
            for(int i = 0; i < arrayData.size() ; i++) { 
            
                JSONObject eachVehicle = (JSONObject)arrayData.get(i);

                String id = (String)eachVehicle.get("identificador");
                String typeStringified = (String)eachVehicle.get("vehicle_type");
                char type = typeStringified.charAt(0);
                double median_speed = (double)eachVehicle.get("median_speed");
                double consumption_per_km = (double)eachVehicle.get("consumption_per_km");
                double max_capacity = (double)eachVehicle.get("max_capacity");
                double actual_loading = (double)eachVehicle.get("actual_loading");
                double min_consumption = (double)eachVehicle.get("min_consumption");
                

                switch(type){
                    case 'L':
                    int horsePower = ((Long)eachVehicle.get("horsePower")).intValue();
                    int numberOfBreakdows = ((Long)eachVehicle.get("numberOfBreakdowns")).intValue();
                    int priceOfBreakdowns = ((Long)eachVehicle.get("priceOfBreakdowns")).intValue();
                    vehicleList.add(new LandTypeV(id, type, median_speed, consumption_per_km, max_capacity,actual_loading,min_consumption, horsePower,numberOfBreakdows,priceOfBreakdowns));
                        break;
                    case 'A':
                    int numberOfEngines = ((Long)eachVehicle.get("numberOfEngines")).intValue();;
                    int operatingTime = ((Long)eachVehicle.get("operatingTime")).intValue();
                    vehicleList.add(new AirTypeV(id, type, median_speed, consumption_per_km, max_capacity,actual_loading,min_consumption, numberOfEngines,operatingTime));
                        break;
                    case 'M':
                    int lenght = ((Long)eachVehicle.get("lenght")).intValue();
                    int beam = ((Long)eachVehicle.get("beam")).intValue();
                    int flotationDate = ((Long)eachVehicle.get("flotationDate")).intValue();
                    String date0fManufacture = (String)eachVehicle.get("dateOfManufacture");
                    vehicleList.add(new MaritimeTypeV(id, type, median_speed, consumption_per_km, max_capacity,actual_loading,min_consumption, lenght,beam,flotationDate, date0fManufacture));
                        break;

                }               
                        
            }
            
            return vehicleList;
            
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }


	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}
	
	

}
