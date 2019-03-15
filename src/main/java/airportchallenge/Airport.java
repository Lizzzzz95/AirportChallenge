package airportchallenge;

import java.util.ArrayList;
import java.util.List;

 class Airport {

    List<Plane> planes;
    private int AIRPORT_CAPACITY = 10;

    Airport(){
        planes = new ArrayList<>(AIRPORT_CAPACITY);
    }

   void releasePlane(Plane plane, Weather weather) {
        if (weather.isStormy()) {
            throw new RuntimeException("Weather is stormy, cannot release plane");
        }
        plane.takeoff(this);
   }

   void receivePlane(Plane plane, Weather weather) {
       if (weather.isStormy()) {
           throw new RuntimeException("Weather is stormy, cannot land plane");
       }
       if (this.isFull()) {
           throw new RuntimeException("Aiport full");
       }
       plane.land(this);
       planes.add(plane);
   }

   boolean isFull() {
       return planes.size() == AIRPORT_CAPACITY;
   }

 }
