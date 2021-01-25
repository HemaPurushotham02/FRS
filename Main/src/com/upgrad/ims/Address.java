package com.upgrad.ims;

public class Address
{
    private String passengerStreet;
    private String passengerCity;
    private String passengerState;

    public Address(String passengerStreet, String passengerCity, String passengerState)
    {
        this.passengerStreet = passengerStreet;
        this.passengerCity = passengerCity;
        this.passengerState = passengerState;
    }

    public String getStreet()
    {
        return passengerStreet;
    }

    public void setStreet(String passengerStreet)
    {
        this.passengerStreet = passengerStreet;
    }

    public String getCity()
    {
        return passengerCity;
    }

    public void setCity(String passengerCity)
    {
        this.passengerCity = passengerCity;
    }

    public String getState()
    {
        return passengerState;
    }

    public void setState(String passengerState)
    {
        this.passengerState = passengerState;
    }

    @Override
    public String toString()
    {
        return ("\nStreet = " + passengerStreet + " , City = " + passengerCity + " , State = " + passengerState + ";");
    }
}

