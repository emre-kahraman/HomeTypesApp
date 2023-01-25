package util;

import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HomeUtil {

    private List<House> houseList = new ArrayList<>();
    private List<SummerHouse> summerHouseList = new ArrayList<>();
    private List<Villa> villaList = new ArrayList<>();

    public HomeUtil() {
        houseList.addAll(List.of(
        HomeFactory.getHome(HomeType.HOUSE, BigDecimal.valueOf(100000), 150, 2, 1),
        HomeFactory.getHome(HomeType.HOUSE, BigDecimal.valueOf(150000), 200, 3, 1),
        HomeFactory.getHome(HomeType.HOUSE, BigDecimal.valueOf(200000), 250, 4, 2)));
        summerHouseList.addAll(List.of(
                HomeFactory.getHome(HomeType.SUMMERHOUSE, BigDecimal.valueOf(100000), 100, 3, 1),
                HomeFactory.getHome(HomeType.SUMMERHOUSE, BigDecimal.valueOf(300000), 200, 5, 2),
                HomeFactory.getHome(HomeType.SUMMERHOUSE, BigDecimal.valueOf(400000), 300, 6, 3)));
        villaList.addAll(List.of(
                HomeFactory.getHome(HomeType.VILLA, BigDecimal.valueOf(600000), 400, 5, 2),
                HomeFactory.getHome(HomeType.VILLA, BigDecimal.valueOf(700000), 500, 7, 3),
                HomeFactory.getHome(HomeType.VILLA, BigDecimal.valueOf(800000), 600, 8, 3)));
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }
}
