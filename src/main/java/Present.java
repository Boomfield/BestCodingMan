import Candies.Candy;
import Candies.ChocolateCandy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Present {

    private String name;

    private ArrayList<Candy> happybox = new ArrayList<>();

    public void addCandy(Candy candy) {
        happybox.add(candy);
    }

    public List<Candy> sortedByWeight() {
        var sortedcandies = happybox.stream()
                .sorted(Comparator.comparingInt(Candy::getWeight));

        return sortedcandies.toList();
    }

    public Candy searchCandy(Candy candy) {
        var serchCandy = happybox.stream()
                .filter(x -> x.equals(candy))
                .findFirst();

        return serchCandy.get();
    }

    public List<Candy> getChocolateCandies() {
        var candychocolate = happybox.stream()
                .filter(x -> x instanceof ChocolateCandy);

        return candychocolate.toList();
    }
}
