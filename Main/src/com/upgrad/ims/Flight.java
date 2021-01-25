package com.upgrad.ims;

public class Flight
{
    String flightNo;
    String airlineName;
    int currentCapacity;
    private int bookedSeats;

    public Flight(String flightNo, String airlineName, int currentCapacity, int bookedSeats) {
        this.flightNo = flightNo;
        this.airlineName = airlineName;
        this.currentCapacity = currentCapacity;
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String checkFlightDetails(){
        return (flightNo + " " + airlineName);
    }
    public  int updateCurrentCapacity(){
        return (currentCapacity-bookedSeats);
    }
    public  void booking(){

    }

    @Override
    public String toString()
    {
        return ("Flight Details: " +
                "\nFlight Number = " + flightNo + "; Airline Name =" + airlineName + "; Current capacity = " + currentCapacity +
                "; Booked Seats = " + bookedSeats +";");
    }
}


