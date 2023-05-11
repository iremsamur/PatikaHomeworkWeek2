import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<House> houses = new ArrayList<>();
        houses.add(new House(100000, 120));
        houses.add(new Villa(500000, 500));
        houses.add(new Summery(200000, 200));
        houses.add(new House(150000, 150));
        houses.add(new Villa(750000, 700));
        houses.add(new Summery(300000, 250));
        houses.add(new House(200000, 180));
        houses.add(new Villa(900000, 900));
        houses.add(new Summery(400000, 300));

        HouseService houseService = new HouseService(houses);
        System.out.println("Evlerin toplam fiyatı: " + houseService.getTotalHousePrice());
        System.out.println("Villaların toplam fiyatı: " + houseService.getTotalVillaPrice());
        System.out.println("Yazlıkların toplam fiyatı: " + houseService.getTotalSummeryPrice());
        System.out.println("Tüm tipteki evlerin toplam fiyatı: " + houseService.getTotalPrice());
        System.out.println("Evlerin ortalama metrekaresi: " + houseService.getAverageHouseSquareMeter());
        System.out.println("Villaların ortalama metrekaresi: " + houseService.getAverageVillaSquareMeter());
        System.out.println("Yazlıkların ortalama metrekaresi: " + houseService.getAverageSummerySquareMeter());
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi: " + houseService.getAverageSquareMeter() );
        System.out.println("2 oda 1 salonlu evler: " + houseService.getFilterResults(2, 1));
        System.out.println("3 oda 1 salonlu villalar: " + houseService.getFilterResults(3, 1));
        System.out.println("1 oda 1 salonlu yazlıklar: " + houseService.getFilterResults(1, 1));
    }
}