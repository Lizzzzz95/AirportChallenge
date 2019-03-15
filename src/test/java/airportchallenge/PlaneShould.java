package airportchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneShould {

    private Plane plane;
    private Airport airport;
    private int testCapacity = 10;

    @BeforeEach
    void init() {
        plane = new Plane();
        airport = new Airport(testCapacity);
    }

    @Test
    void check_plane_has_landed_in_airport() {
        plane.land(airport);
        assertEquals(plane.getCurrentAirport(), airport);
    }

    @Test
    void check_plane_has_taken_off() {
        plane.takeoff(airport);
        assertNull(plane.getCurrentAirport());
    }


}
