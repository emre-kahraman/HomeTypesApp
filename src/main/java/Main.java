import service.HomeService;
import util.HomeUtil;

public class Main {

    public static void main(String[] args) {
        HomeService homeService = new HomeService(new HomeUtil());
        System.out.println("Evlerin toplam fiyatı: " + homeService.getHouseTotalPrice());
        System.out.println("Yazlıkların toplam fiyatı: " + homeService.getSummerHouseTotalPrice());
        System.out.println("Villaların toplam fiyatı: " + homeService.getVillaTotalPrice());
        System.out.println("Tüm Evlerin toplam fiyatı: " + homeService.getAllHomesTotalPrice());
        System.out.println("Evlerin ortalama metrekaresi: " + homeService.getHouseAverageSquareMeter());
        System.out.println("Yazlıkların ortalama metrekaresi: " + homeService.getSummerHouseAverageSquareMeter());
        System.out.println("Villaların ortalama metrekaresi: " + homeService.getVillaAverageSquareMeter());
        System.out.println("Tüm Evlerin ortalama metrekaresi: " + homeService.getAllHomesAverageSquareMeter());
        System.out.println("5 odası ve 2 salonu olan evler: " + homeService.getHomesByRoomNumberAndSaloonNumber(5, 2));
    }
}
