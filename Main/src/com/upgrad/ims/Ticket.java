package com.upgrad.ims;

public class Ticket
{


    String PNRNumber;
    String departureLoc;
    String destinationLoc;
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;
    Passenger passenger;
    String seatNo;
    boolean ticketActive;
    int price;
    Flight flight;

    public Ticket(String PNRNumber, String departureLoc, String destinationLoc,
                  String departureDate, String departureTime, String arrivalDate, String arrivalTime, Passenger P,
                  String seatNo, boolean ticketActive, int price, Flight flight)
    {
        this.PNRNumber = PNRNumber;
        this.departureLoc = departureLoc;
        this.destinationLoc = destinationLoc;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.ticketActive = ticketActive;
        this.price = price;
        this.flight = flight;
    }





    public void cancelTicket()
    {
        ticketActive = false;

    }

    @Override
    public String toString()
    {
        return ("Ticket Details: \n" + "PNR Number = " + PNRNumber + "\n  DepartureLocation = " + departureLoc + "\n Destination Location = " + destinationLoc +
                "\n Departure Date = " + departureDate + "; Departure Time (hours) = " + departureTime + ";\n" + "Arrival Date = " + arrivalDate + ";" +
                " Arrival Time (hours) = " + arrivalTime + ";\n" + "Passenger Details = " + passenger +
                "\n Seat Number = " + seatNo + "\nTicket Status = " + ticketActive + "\n Price = " + price +
                "\n Flight Details = " + flight);
    }


}
