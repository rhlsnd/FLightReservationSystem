package com.FlightReservationSystem;

public class Passenger {
    // Attributes for Passenger class
    private static int idCount;

    static {
        idCount = 0;
    }
   
    private int id;
   
    //    inner class Address
    private static class Address {
        String streetName, cityName, stateName;
        //   Constructor for inner class Address
        Address(String streetName, String cityName, String stateName) {
            this.streetName = streetName;
            this.cityName = cityName;
            this.stateName = stateName;
        }
    }
    private Address address;
    //    inner class Contact
    private static class Contact {
        String passengerName, passengerPhone, passengerEmailId;
        //   Constructor for inner class Contact
        Contact(String passengerName, String passengerPhone, String passengerEmailId) {
            this.passengerName = passengerName;
            this.passengerPhone = passengerPhone;
            this.passengerEmailId = passengerEmailId;
        }
    }
    private Contact contact;
    //   Constructor for class Passenger
    public Passenger(String street, String city, String state, String passengerName, String passengerPhone, String passengerEmailId) {
        this.id = ++idCount;
        this.address = new Address(street, city, state);
        this.contact = new Contact(passengerName, passengerPhone, passengerEmailId);
    }
    // Methods for passenger class

    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return "Street: " + address.streetName + ", City: " + address.cityName + ", State: " + address.stateName;
    }

    public String getContactDetails() {
        return "Name: "+contact.passengerName+", Phone: "+contact.passengerPhone+", Email: "+contact.passengerEmailId;
    }

    public static int getPassengerCount() {
        return idCount;
    }
}

