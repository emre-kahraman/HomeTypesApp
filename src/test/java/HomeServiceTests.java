import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.HomeService;
import util.HomeUtil;

import java.math.BigDecimal;

public class HomeServiceTests {

    HomeService homeService = new HomeService(new HomeUtil());

    @Test
    public void itShouldGetHouseTotalPrice(){
        Assertions.assertEquals(BigDecimal.valueOf(450000), homeService.getHouseTotalPrice());
    }

    @Test
    public void itShouldGetSummerHouseTotalPrice(){
        Assertions.assertEquals(BigDecimal.valueOf(800000), homeService.getSummerHouseTotalPrice());
    }

    @Test
    public void itShouldGetVillaTotalPrice(){
        Assertions.assertEquals(BigDecimal.valueOf(2100000), homeService.getVillaTotalPrice());
    }

    @Test
    public void itShouldGetAllHomesTotalPrice(){
        Assertions.assertEquals(BigDecimal.valueOf(3350000), homeService.getAllHomesTotalPrice());
    }

    @Test
    public void itShouldGetHouseAverageSquareMeter(){
        Assertions.assertEquals(Double.valueOf(200), homeService.getHouseAverageSquareMeter());
    }

    @Test
    public void itShouldGetSummerHouseAverageSquareMeter(){
        Assertions.assertEquals(Double.valueOf(200), homeService.getSummerHouseAverageSquareMeter());
    }

    @Test
    public void itShouldGetVillaAverageSquareMeter(){
        Assertions.assertEquals(Double.valueOf(500), homeService.getVillaAverageSquareMeter());
    }

    @Test
    public void itShouldGetAllHomesAverageSquareMeter(){
        Assertions.assertEquals(300, homeService.getAllHomesAverageSquareMeter());
    }

    @Test
    public void itShouldGetHomesByRoomNumberAndSaloonNumber(){
        Assertions.assertEquals(1, homeService.getHomesByRoomNumberAndSaloonNumber(2, 1).size());
        Assertions.assertEquals(2, homeService.getHomesByRoomNumberAndSaloonNumber(2, 1).get(0).getRoomNumber());
        Assertions.assertEquals(1, homeService.getHomesByRoomNumberAndSaloonNumber(2, 1).get(0).getSaloonNumber());
    }
}
