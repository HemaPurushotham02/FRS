package com.upgrad.ims;

public class RegularTicket extends Ticket
{
    private String specialService;

    public RegularTicket(String PNRNumber, String departureLoc, String destinationLoc,
                         String departureDate, String departureTime, String arrivalDate, String arrivalTime, Passenger passenger,
                         String seatNo, boolean ticketActive, float price, Flight flight, String specialService)
    {
        super(PNRNumber, departureLoc, destinationLoc, departureDate, departureTime, arrivalDate, arrivalTime, passenger, seatNo, ticketActive, price,
                flight);
        this.specialService = specialService;
    }

    public String getSpecialService()
    {
        return specialService;
    }

    public void setSpecialService(String specialService)
    {
        this.specialService = specialService;
    }

    @Override
    public String toString()
    {
        return ("Regular Ticket Details: " + "Special Service = " + specialService) ;
    }
}
