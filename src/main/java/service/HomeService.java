package service;

import model.Home;
import model.House;
import model.SummerHouse;
import model.Villa;
import util.HomeUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeService {

    private final HomeUtil homeUtil;

    public HomeService(HomeUtil homeUtil) {
        this.homeUtil = homeUtil;
    }

    public BigDecimal getHouseTotalPrice(){
        return homeUtil.getHouseList()
                .stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getSummerHouseTotalPrice(){
        return homeUtil.getSummerHouseList()
                .stream()
                .map(SummerHouse::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getVillaTotalPrice(){
        return homeUtil.getVillaList()
                .stream()
                .map(Villa::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getAllHomesTotalPrice(){
        return getHouseTotalPrice()
                .add(getSummerHouseTotalPrice())
                .add(getVillaTotalPrice());
    }

    public Double getHouseAverageSquareMeter(){
        return homeUtil.getHouseList()
                .stream()
                .mapToDouble(House::getSquareMeter)
                .sum()/homeUtil.getHouseList().size();
    }

    public Double getSummerHouseAverageSquareMeter(){
        return homeUtil.getSummerHouseList()
                .stream()
                .mapToDouble(SummerHouse::getSquareMeter)
                .sum()/homeUtil.getSummerHouseList().size();
    }

    public Double getVillaAverageSquareMeter(){
        return homeUtil.getVillaList()
                .stream()
                .mapToDouble(Villa::getSquareMeter)
                .sum()/homeUtil.getVillaList().size();
    }

    public Double getAllHomesAverageSquareMeter(){
        return ((getHouseAverageSquareMeter()*homeUtil.getHouseList().size())
                +(getSummerHouseAverageSquareMeter()*homeUtil.getSummerHouseList().size())
                +(getVillaAverageSquareMeter()*homeUtil.getVillaList().size()))
                /(homeUtil.getHouseList().size()+homeUtil.getSummerHouseList().size()+homeUtil.getVillaList().size());
    }

    public List<Home> getHomesByRoomNumberAndSaloonNumber(int roomNumber, int saloonNumber){
        List<Home> homeList = new ArrayList<>();
        homeList.addAll(homeUtil.getHouseList()
                .stream()
                .filter(h -> h.getRoomNumber() == roomNumber && h.getSaloonNumber() == saloonNumber)
                .collect(Collectors.toList()));
        homeList.addAll(homeUtil.getSummerHouseList()
                .stream()
                .filter(h -> h.getRoomNumber() == roomNumber && h.getSaloonNumber() == saloonNumber)
                .collect(Collectors.toList()));
        homeList.addAll(homeUtil.getVillaList().
                stream()
                .filter(h -> h.getRoomNumber() == roomNumber && h.getSaloonNumber() == saloonNumber)
                .collect(Collectors.toList()));
        return homeList;
    }
}
