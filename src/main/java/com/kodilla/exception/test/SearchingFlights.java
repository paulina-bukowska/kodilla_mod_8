package com.kodilla.exception.test;

public class SearchingFlights {
    public static void main(String[] args) {

        SearchFlight searchFlight = new SearchFlight();

        Flight fromOwensboroToVancouver = new Flight("Owensboro", "Vancouver");
        Flight fromChicagoToAnchorage = new Flight("Chicago", "Anchorage");
        Flight fromBeaverIslandToWarsaw = new Flight("Beaver Island", "Warsaw");

        try {
            boolean possibleToArrive = searchFlight.findFlight(fromOwensboroToVancouver);
            System.out.println(possibleToArrive);
        } catch(RouteNotFoundException e) {
            System.out.println("That airport doesn't exist!");
        } finally {
            System.out.println("...Searching atempt done...\n");
        }

        try {
            boolean possibleToArrive = searchFlight.findFlight(fromChicagoToAnchorage);
            System.out.println(possibleToArrive);
        } catch(RouteNotFoundException e) {
            System.out.println("That airport doesn't exist!");
        } finally {
            System.out.println("...Searching atempt done...\n");
        }

        try {
            boolean possibleToArrive = searchFlight.findFlight(fromBeaverIslandToWarsaw);
                System.out.println(possibleToArrive);
        } catch(RouteNotFoundException e) {
            System.out.println("That airport doesn't exist!");
        } finally {
            System.out.println("...Searching atempt done...\n");
        }
    }
}
