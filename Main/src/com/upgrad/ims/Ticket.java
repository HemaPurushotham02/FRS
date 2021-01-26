package com.upgrad.ims;

public abstract class Ticket
{


    private String PNRNumber;
    private String departureLoc;
    private String destinationLoc;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private Passenger passenger;
    private String seatNo;
    private boolean ticketActive;
    private float price;
    private Flight flight;

    public Ticket(String PNRNumber, String departureLoc, String destinationLoc,
                  String departureDate, String departureTime, String arrivalDate, String arrivalTime, Passenger passenger,
                  String seatNo, boolean ticketActive, float price, Flight flight)
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

    public String getPNRNumber()
    {
        return PNRNumber;
    }

    public void setPNRNumber(String PNRNumber)
    {
        this.PNRNumber = PNRNumber;
    }


    public String getDepartureLoc()
    {
       return departureLoc;
    }

    public void setDepartureLoc(String departureLoc)
    {
        this.departureLoc = departureLoc;;
    }


    public String getDestinationLoc()
    {
        return destinationLoc;
    }

    public void setDestinationLoc(String destinationLoc)
    {
        this.destinationLoc = destinationLoc;
    }


    public String getDepartureDate()
    {
        return departureDate;
    }

    public void setDepartureDate(String departureDate)
    {
        this.departureDate = departureDate;
    }


    public String getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(String departureTime)
    {
        this.departureTime = departureTime;
    }


    public String getArrivalDate()
    {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate)
    {
        this.arrivalDate = arrivalDate;
    }


    public String getArrivalTime()
    {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }


    public Passenger getPassenger()
    {
        return passenger;
    }

    public void setPassenger(Passenger passenger)
    {
        this.passenger = passenger;
    }


    public String getSeatNo()
    {
        return seatNo;
    }

    public void setSeatNo(String seatNo)
    {
        this.seatNo = seatNo;
    }


    public boolean getTicketActive()
    {
        return ticketActive;
    }
    public void setTicketActive(boolean ticketActive)
    {
        this.ticketActive = ticketActive;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price = price;
    }
    public Flight getFlight()
    {
        return flight;
    }
    public void setFlight(Flight flight)
    {
        this.flight = flight;
    }

    Ticket(Flight flight, Passenger passenger)
    {
        this.flight = flight;
        this.passenger = passenger;
    }
    public  String checkStatus()
    {
        if(ticketActive == true)
        {
            return "Confirmed";
        }
        else
        {
            return "Canceled";
        }
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
