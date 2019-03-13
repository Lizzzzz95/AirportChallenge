package airportchallenge;

import java.util.ArrayList;
import java.util.List;

 class Airport {

    List<Plane> planes;

    Airport(){
       planes = new ArrayList<>(20);
   }


    void displayAirport() {
        planes.forEach(plane -> System.out.println(plane));
    }
}
