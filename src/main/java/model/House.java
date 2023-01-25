package model;

import java.math.BigDecimal;

public class House extends Home{

    private final BigDecimal price;
    private final int squareMeter;
    private final int roomNumber;
    private final int saloonNumber;

    protected House(BigDecimal price, int squareMeter, int roomNumber, int saloonNumber) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public int getSquareMeter() {
        return this.squareMeter;
    }

    @Override
    public int getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public int getSaloonNumber() {
        return this.saloonNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomNumber=" + roomNumber +
                ", saloonNumber=" + saloonNumber +
                '}';
    }
}
