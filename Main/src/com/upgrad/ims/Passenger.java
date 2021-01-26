package com.upgrad.ims;

public class Passenger
{

   private Address address;
   private Contact contact;
   private static int id;

    public Passenger(String passengerStreet, String passengerCity, String passengerState, String passengerName, String passengerPhoneNo, String passengerEmail, int id) {
        this.address = new Address(passengerStreet, passengerCity, passengerState);
        this.contact = new Contact(passengerName, passengerPhoneNo, passengerEmail);
        this.id = id++;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        id = id;
    }

    public Contact getContact()
    {
        return contact;
    }

    public Address getAddress()
    {
        return address;
    }
    public void setContact(Contact contact)
    {
        this.contact = contact;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public static int getPassengerCount()
    {
        return id;
    }
    @Override
    public String toString()
    {
        return ("Passenger Details: \n" + "id =" + id + "\nPassenger Contact Details = " + contact + "\nPassenger Address Details = " + address) ;
    }
}

