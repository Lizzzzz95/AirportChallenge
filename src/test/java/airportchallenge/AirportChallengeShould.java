package airportchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AirportChallengeShould {
    Airport airport;
    Plane plane;

    @BeforeEach
    void init() {
        airport = new Airport();
        plane = new Plane();
    }

    @Test
    void returnAnInitallyEmptyAirport(){
        airport.displayAirport();
    }

//    @Test
//    public void return_plane1_and_plane2_for_plane2(){
//        assertEquals();
//    }

}
