package com.FlightReservationSystem;

public class Main {
	
	 System.out.println(ticket.getFrom());
         System.out.println(ticket.getTo());
         System.out.println(ticket.getPnr());
         System.out.println(ticket.getSeatNo());
	
    }

    public static void main(String[] args) {
	// Here Two booking are done one of Regular ticket and one of Tourist ticket
        Ticket regularTicket = new RegularTicket("00225", "Pune",
                "Mumbai", "2018-12-30T19:34:50.63", "2018-12-30T19:34:50.63",
                "33C", 2599, false, null, null, "Speacial lunch");

        Ticket touristTicket = new TouristTicket("451221", "INDIA", "USA",
                "2018-12-30T19:34:50.63", "2018-12-31T14:32:50.63",
                "44P", 119000, false, null, null,
                "Washington High Hotel", new String[]{""});
        // this prints the flight from and to and PRN number and seat number
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
}
