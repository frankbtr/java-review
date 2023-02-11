import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class State {

    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }

    public List<String> getCity(){
        return this.cities;
    }
}
