package com.company;

import com.dispatcher.Dispatcher;

public class Bus {
    private String name;
    private int seats;
    private int passengers;

    public Bus backupBus;

    public Bus() {
        name = "Yellow bus";
        seats = 25;
        passengers = 0;
    }

    public Bus(String name, int seats) {
        this.name = name;
        this.seats = seats;
        passengers = 0;
    }

    public void printBusState() {
        System.out.println("Bus name: " + name);
        System.out.println("Seat count: " + seats);
        System.out.println("Number of passengers: " + passengers);
        if (backupBus != null) {
            System.out.println("!!!Backup bus!!!");
            backupBus.printBusState();
        }
    }

    /**
    * adds one passenger
    * returns true if added, false otherwise
     **/
    public boolean addPassenger() {
        if (seats > passengers) {
            passengers++;
            return true;
        }
        return false;
    }

    /**
     * adds given number of passengers
     * returns true if added, false otherwise
     **/
    public boolean addPassenger(int count) {
        if (seats - passengers >= count) {
            passengers += count;
            return true;
        }
        return false;
    }

    /**
     * @param bus
     * @return true if current bus is bigger than the argument
     */
    public boolean isBigger(Bus bus) {
        return this.seats > bus.seats;
    }

    public boolean merge(Bus bus) {
        return this.addPassenger(bus.passengers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}

