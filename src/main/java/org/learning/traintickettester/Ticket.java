package org.learning.traintickettester;

public class Ticket {
    private final double PRICE_PER_KM = 0.21;
    private final double DISCOUNT_UN18 = 0.20;
    private final double DISCOUNT_OV65 = 0.40;

    private double kmToTravel;
    private int passengerAge;

    public Ticket(double kmToTravel, int passengerAge) throws IllegalArgumentException{
        if(kmToTravel <=0 || passengerAge <=0)
            throw new IllegalArgumentException("Invalid fields.");
        this.kmToTravel = kmToTravel;
        this.passengerAge = passengerAge;
    }

    public double getBasePrice() {
        return kmToTravel * PRICE_PER_KM;
    }

    public double getFinalPrice() {
        double discountUnder18 = getBasePrice() * DISCOUNT_UN18;
        double discountOver65 = getBasePrice() * DISCOUNT_OV65;

        double finalPrice = getBasePrice();
        if (passengerAge < 18) {
            finalPrice = getBasePrice() - discountUnder18;
        } else if (passengerAge >= 65) {
            finalPrice = getBasePrice() - discountOver65;
        }

        return finalPrice;
    }
}