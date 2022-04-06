/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      WeatherStation[] allstns = ds.fetchArray("WeatherStation", "station/station_name", 
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());
      
      WeatherStation[] nystns = new WeatherStation[50];
      int count = 0;
      for (int i = allstns[i]-1; i >= 0; i--){
         if (allstns[i].isLocatedInState("NY"){
            nystns[count] = allstns[i];
            count ++;
         }
      }
      System.out.println(Arrays.toString(nystns));
      WeatherStation southern = allstns[allstns.length-1];
      for(int i = allstns.length-2; i >= 0; i--){
        if(allstns[i].getLat() < southern.getLat()){
          southern = allstns[i];
        }
      }
      System.out.println("Southern most station: " + southern);      
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
   }
}
