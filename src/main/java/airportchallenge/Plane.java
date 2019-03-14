package airportchallenge;

public class Plane {

    private Airport currentAirport;
//    This is defining a variable 'currentAirport'. This could be put anywhere but it's
//    clearer/convention to define all variables at the start

    Plane() {
        currentAirport = null;
//        This means the current plane is initially not linked to any airport
    }

    Airport getCurrentAirport() {
        return this.currentAirport;
    }

    void land(Airport airport) {
        currentAirport = airport;
    }

    void takeoff(Airport airport) {
        currentAirport = null;
    }
}
