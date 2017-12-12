package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Ottawa", false);
        airports.put("Vancouver", true);
        airports.put("Anchorage", false);
        airports.put("Fairbanks", true);
        airports.put("Portland", false);
        airports.put("Chicago", true);
        airports.put("Escanaba", false);
        airports.put("Panama City Beach", true);
        airports.put("Honolulu", true);
        airports.put("Indianapolis", true);
        airports.put("Des Moines", true);
        airports.put("Owensboro", false);
        airports.put("Lake Charles", true);
        airports.put("Beaver Island", true);
        airports.put("Pellston", false);

        boolean possibleToArrive = false;

        if(airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())) {
            possibleToArrive = airports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }

        return possibleToArrive;
    }
}
