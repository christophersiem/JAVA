package de.neuefische.models;
public class Aircraft {

    private String aircraft;
    private int seats;

    public Aircraft(String aircraft, int seats) {

        this.aircraft=aircraft;
        this.seats = seats;


    }

    public int getSeats(){
        return seats;
    }

    public String getAircraft(){
        return aircraft;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraft='" + aircraft + '\'' +
                ", seats=" + seats +
                '}';
    }
}
