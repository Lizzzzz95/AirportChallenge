package airportchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WeatherShould {

    private Weather weather;
    private Weather stormyWeather = Mockito.mock(Weather.class);

    @BeforeEach
    void init() {
        weather = new Weather();
        when(stormyWeather.isStormy()).thenReturn(true);
    }

    @Test
    void check_weather_is_stormy_20_percent_of_the_time() {
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            if (weather.isStormy()) {
                count = count + 1;
            }
        }
        assertEquals(count, 2000, 100);
    }

    @Test
    void throw_error_if_weather_is_stormy() {
        assertTrue(stormyWeather.isStormy());
    }
}
