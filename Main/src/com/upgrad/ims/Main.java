package com.upgrad.ims;

public class Main {
    public static void main(String[] arg) {

        String[] locations = {"New York", "Chicago", "Atlanta", "Mexico", "California"};
        Address ad = new Address("xyz", "random city", "random state");
        Contact con = new Contact("abc", "1111111111", "abc@gmail.com");
        Flight flights = new Flight("123", "GG", 200, 150);
        Passenger p = new Passenger(ad, con, 111);
        Ticket ticket = new Ticket("192837", "India", "London", "06.01.2021", "12:55", "08.01.2021", "18:00",p, "15",
                false, 5500, flights);
        RegularTicket reg = new RegularTicket("Food, Water");
        TouristTicket tour = new TouristTicket("Random address", locations);

        System.out.println(flights.checkFlightDetails());
        System.out.println(flights.updateCurrentCapacity());


        System.out.println(ad);
        System.out.println(con);
        System.out.println(flights);
        System.out.println(p);
        System.out.println(ticket);
        System.out.println(reg);
        System.out.println(tour);

    }
}

