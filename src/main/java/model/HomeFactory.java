package model;

import java.math.BigDecimal;

public class HomeFactory {

    public static <T extends Home> T getHome(HomeType homeType, BigDecimal price, int squareMeter, int roomNumber, int saloonNumber){
        switch (homeType){
            case HOUSE -> {
                return (T) new House(price, squareMeter, roomNumber, saloonNumber);
            }
            case SUMMERHOUSE -> {
                return (T) new SummerHouse(price, squareMeter, roomNumber, saloonNumber);
            }
            case VILLA -> {
                return (T) new Villa(price, squareMeter, roomNumber, saloonNumber);
            }
            default -> throw new IllegalStateException("Home type "+homeType+" is not valid");
        }
    }
}
