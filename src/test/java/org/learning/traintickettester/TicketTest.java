package org.learning.traintickettester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    Ticket ticket;

    @Test
    void getDiscountedPriceNoDiscount() {
        ticket = new Ticket(100, 20);

        assertEquals(21, ticket.getFinalPrice());
    }

    @Test
    void getDiscountedPrice18() {
        ticket = new Ticket(100, 17);

        assertEquals(16.8, ticket.getFinalPrice());
    }

    @Test
    void getDiscountedPrice65() {
        ticket = new Ticket(100, 65);

        assertEquals(12.6, ticket.getFinalPrice());
    }
}