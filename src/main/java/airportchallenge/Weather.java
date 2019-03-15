package airportchallenge;

import java.util.*;

class Weather {

    private List<Boolean> condition;

    Weather(){
        condition = Arrays.asList(false, false, false, false, true);
    }

    boolean isStormy(){
        Random rand = new Random();
        return condition.get(rand.nextInt(condition.size()));
    }

}