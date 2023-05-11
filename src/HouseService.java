import java.util.ArrayList;
import java.util.List;

public class HouseService implements IHouseService{
    private List<House> houses;
    public HouseService(List<House> houses) {
        this.houses = houses;
    }
    @Override
    public List<House> getHouseList() {
        List<House> houseList = new ArrayList<>();
        for (House house : houses) {
            if (house instanceof House) {
                houseList.add(house);
            }
        }
        return houseList;
    }

    @Override
    public List<Villa> getVillaList() {
        List<Villa> villaList = new ArrayList<>();
        for (House house : houses) {
            if (house instanceof Villa) {
                villaList.add((Villa) house);
            }
        }
        return villaList;
    }

    @Override
    public List<Summery> getSummeryList() {
        List<Summery> summeryList = new ArrayList<>();
        for (House house : houses) {
            if (house instanceof Summery) {
                summeryList.add((Summery) house);
            }
        }
        return summeryList;
    }

    @Override
    public int getTotalHousePrice() {
        int totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getTotalVillaPrice() {
        int totalPrice = 0;
        for (Villa villa : getVillaList()) {
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getTotalSummeryPrice() {
        int totalPrice = 0;
        for (Summery summery : getSummeryList()) {
            totalPrice += summery.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getTotalPrice() {
        int totalPrice = 0;
        for (House house : houses) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    @Override
    public double getAverageHouseSquareMeter() {
        double totalSquareMeter = 0;
        int houseCount = 0;
        for (House house : houses) {
            totalSquareMeter += house.getSquareMeter();
            houseCount++;
        }
        return totalSquareMeter / houseCount;
    }

    @Override
    public double getAverageVillaSquareMeter() {
        double totalSquareMeter = 0;
        double villaCount = 0;
        for (Villa villa : getVillaList()) {
            totalSquareMeter += villa.getSquareMeter();
            villaCount++;
        }
        return totalSquareMeter / villaCount;
    }

    @Override
    public double getAverageSummerySquareMeter() {
        double totalSquareMeter = 0;
        int summeryCount = 0;
        for (Summery summery : getSummeryList()) {
            totalSquareMeter += summery.getSquareMeter();
            summeryCount++;
        }
        return totalSquareMeter / summeryCount;
    }

    @Override
    public double getAverageSquareMeter() {
        double totalSquareMeter = 0;
        int houseCount = 0;
        for (House house : houses) {
            totalSquareMeter += house.getSquareMeter();
            houseCount++;
        }
        return totalSquareMeter / houseCount;
    }

    @Override
    public List<House> getFilterResults(int roomCount, int numberOfHalls) {
        List<House> filterResult = new ArrayList<>();
        for (House house : houses) {
            if (house instanceof House && roomCount == 2 && numberOfHalls == 1) {
                filterResult.add(house);
            } else if (house instanceof Villa && roomCount == 3 && numberOfHalls == 1) {
                filterResult.add(house);
            } else if (house instanceof Summery && roomCount == 1 && numberOfHalls == 1) {
                filterResult.add(house);
            }
        }
        return filterResult;
    }
}
