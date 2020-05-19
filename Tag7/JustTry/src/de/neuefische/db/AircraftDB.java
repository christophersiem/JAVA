package de.neuefische.db;

import de.neuefische.models.Aircraft;


public class AircraftDB {

    private Aircraft[] aircraft;
    private int seats;

    public AircraftDB(Aircraft[] aircraft) {

        this.aircraft = aircraft;


    }

    // Methode gibt die Flugzeugtypen aus, die mehr als "int seatsmin" Sitze haben

    String result ="";

    public String seats(int seatsmin) {



        for (int i = 0; i < seatsmin; i++) {
            if (aircraft[i].getSeats() >= seatsmin) {
                result += aircraft[i].getAircraft() + ", ";

            }
            return null;


        }

    } return result;

}



