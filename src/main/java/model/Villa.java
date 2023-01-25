package model;

import java.math.BigDecimal;

public class Villa extends Home{

    private final BigDecimal price;
    private final int squareMeter;
    private final int roomNumber;
    private final int saloonNumber;

    protected Villa(BigDecimal price, int squareMeter, int roomNumber, int saloonNumber) {
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
        return "Villa{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomNumber=" + roomNumber +
                ", saloonNumber=" + saloonNumber +
                '}';
    }
}
