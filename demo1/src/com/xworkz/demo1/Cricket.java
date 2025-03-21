package com.xworkz.demo1;

public class Cricket {
    Ticket ticket;

    Cricket(Ticket ticket) {
        this.ticket = ticket;
    }

    void watch() {
        ticket.buy();
    }

    void profit() {
        ticket.sell();
    }
}

