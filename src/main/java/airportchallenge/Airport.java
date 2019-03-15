package airportchallenge;

import java.util.ArrayList;
import java.util.List;

 class Airport {

    List<Plane> planes;
    int airportCapacity;

    Airport(int capacity){
        planes = new ArrayList<>(capacity);
        airportCapacity = capacity;
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
       return planes.size() == this.airportCapacity;
   }

 }
