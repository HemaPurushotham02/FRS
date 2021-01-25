package com.upgrad.ims;
import java.util.Arrays;

public class TouristTicket {
    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public TouristTicket(String hotelAddress, String[] touristLocations)
    {
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


