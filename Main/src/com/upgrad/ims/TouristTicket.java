package com.upgrad.ims;
import java.util.Arrays;

public class TouristTicket extends Ticket
{
    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public TouristTicket(String PNRNumber, String departureLoc, String destinationLoc,
                         String departureDate, String departureTime, String arrivalDate, String arrivalTime, Passenger passenger,
                         String seatNo, boolean ticketActive, float price, Flight flight,String hotelAddress, String[] touristLocations)
    {
        super(PNRNumber, departureLoc, destinationLoc, departureDate, departureTime, arrivalDate, arrivalTime, passenger, seatNo, ticketActive, price,
                flight);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public String getHotelAddress()
    {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress)
    {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation()
    {
        return touristLocations;
    }

    public void setSelectedTouristLocation(String[] touristLocations)
    {
        this.touristLocations = touristLocations;
    }

    public void updateTouristLocations(String location)
    {

    }

    @Override
    public String toString() {
        return ("TouristTicket Details: \n" + "Hotel Address = " + hotelAddress + ", Selected Tourist Location/s = " + Arrays.toString(touristLocations) + ";");
    }
}


