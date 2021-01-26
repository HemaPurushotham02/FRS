package com.upgrad.ims;

public class Flight
{
    private String flightNo;
    private String airlineName;
    private int currentCapacity;
    private int bookedSeats;

    public Flight(String flightNo, String airlineName, int currentCapacity, int bookedSeats)
    {
        this.flightNo = flightNo;
        this.airlineName = airlineName;
        this.currentCapacity = currentCapacity;
        this.bookedSeats = bookedSeats;
    }
    public String getFlightNo()
    {
        return flightNo;
    }
    public void setFlightNo(String flightNo)
    {
        this.flightNo = flightNo;
    }
    public String getAirlineName()
    {
        return airlineName;
    }
    public void setAirlineName(String airlineName)
    {
        this.airlineName = airlineName;
    }
    public int getCurrentCapacity()
    {
        return currentCapacity;
    }
    public void setCurrentCapacity(int currentCapacity)
    {
        this.currentCapacity = currentCapacity;
    }
    public int getBookedSeats()
    {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats)
    {
        this.bookedSeats = bookedSeats;
    }

    public String checkFlightDetails()
    {
        return (flightNo + " " + airlineName);
    }
    public  int updateCurrentCapacity()
    {
        return (currentCapacity-bookedSeats);
    }
    public  void booking()
    {

    }

    @Override
    public String toString()
    {
        return ("Flight Details: " +
                "\nFlight Number = " + flightNo + "; Airline Name =" + airlineName + "; Current capacity = " + currentCapacity +
                "; Booked Seats = " + bookedSeats +";");
    }
}


