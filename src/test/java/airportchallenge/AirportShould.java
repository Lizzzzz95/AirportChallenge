package airportchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class AirportShould {

    private Airport airport;
    private Plane plane;
    private Weather stormyWeather = Mockito.mock(Weather.class);
    private Weather notStormyWeather = Mockito.mock(Weather.class);
    private int AIRPORT_CAPACITY = 10;

    @BeforeEach
    void init() {
        airport = new Airport();
        plane = new Plane();
        when(stormyWeather.isStormy()).thenReturn(true);
        when(notStormyWeather.isStormy()).thenReturn(false);
    }

    @Test
    void prevent_takeoff_when_weather_is_stormy() {
        assertTrue(stormyWeather.isStormy());
        assertThrows(RuntimeException.class, () -> airport.releasePlane(plane, stormyWeather));
    }

    @Test
    void allow_takeoff_when_weather_is_not_stormy() {
        assertFalse(notStormyWeather.isStormy());
        airport.releasePlane(plane, notStormyWeather);
        assertNull(plane.getCurrentAirport());
    }


    @Test
    void prevent_landing_when_weather_is_stormy() {
        assertTrue(stormyWeather.isStormy());
        assertThrows(RuntimeException.class, () -> airport.receivePlane(plane, stormyWeather));
    }

    @Test
    void allow_landing_when_weather_is_not_stormy() {
        assertFalse(notStormyWeather.isStormy());
        airport.receivePlane(plane, notStormyWeather);
        assertEquals(plane.getCurrentAirport(), airport);
        assertTrue(airport.planes.contains(plane));
    }

    @Test
    void prevent_landing_when_airport_is_full() {
        for (int i = 0; i < AIRPORT_CAPACITY; i++){
            airport.receivePlane(new Plane(), notStormyWeather);
        }
        assertTrue(airport.isFull());
        assertThrows(RuntimeException.class, () -> airport.receivePlane(plane, notStormyWeather));
    }

}
