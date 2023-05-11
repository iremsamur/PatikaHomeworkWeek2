import java.util.List;

public interface IHouseService {
    List<House> getHouseList();
    List<Villa> getVillaList();
    List<Summery> getSummeryList();
    int getTotalHousePrice();
    int getTotalVillaPrice();
    int getTotalSummeryPrice();
    int getTotalPrice();
    double getAverageHouseSquareMeter();
    double getAverageVillaSquareMeter();
    double getAverageSummerySquareMeter();
    double getAverageSquareMeter();
    List<House> getFilterResults(int roomCount, int numberOfHalls);


}
