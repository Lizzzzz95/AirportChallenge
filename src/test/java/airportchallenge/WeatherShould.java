package airportchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherShould {

    private Weather weather;

    @BeforeEach
    void init() {
        weather = new Weather();
    }

    @Test
    void check_weather_is_stormy_20_percent_of_the_time() {
        assertEquals(weather.isStormy(), true/*, delta*/);
    }
}
