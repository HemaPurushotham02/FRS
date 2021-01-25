package com.upgrad.ims;

public class Passenger
{

    Address address;
    Contact contact;
    private int id;

    public Passenger(Address address, Contact contact, int id) {
        this.address = address;
        this.contact = contact;
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Contact getContact()
    {
        return contact;
    }

    public Address getAddress()
    {
        return address;
    }

    @Override
    public String toString()
    {
        return ("Passenger Details: \n" + "id =" + id + "\nPassenger Contact Details = " + contact + "\nPassenger Address Details = " + address) ;
    }
}

