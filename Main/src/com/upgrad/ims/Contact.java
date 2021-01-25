package com.upgrad.ims;

public class Contact
{
    private String passengerName;
    private String passengerPhoneNo;
    private String passengerEmail;

    public Contact(String passengerName, String passengerPhoneNo, String passengerEmail)
    {
        this.passengerName = passengerName;
        this.passengerPhoneNo = passengerPhoneNo;
        this.passengerEmail = passengerEmail;
    }

    public String getName()
    {
        return passengerName;
    }

    public void setName(String name)
    {
        this.passengerName = passengerName;
    }

    public String getPhoneNumber()
    {
        return passengerPhoneNo;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.passengerPhoneNo = passengerPhoneNo;
    }

    public String getEmailId()
    {
        return passengerEmail;
    }

    public void setEmailId(String passengerEmail)
    {
        this.passengerEmail = passengerEmail;
    }

    @Override
    public String toString()
    {
        return ("\nName = " + passengerName +" , Phone Number = " + passengerPhoneNo + " , Email Id = " + passengerEmail + ";");
    }
}

