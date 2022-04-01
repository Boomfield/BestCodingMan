import Candies.*;
import Core.CustomArrayList;

import java.util.ArrayList;


public class Happyyear {
    public static void main(String[] args) {
        ChocolateCandy kinder = new Kinder();
        ChocolateCandy trufel = new Trufel(23, 13, ChocolateType.Black);
        ChocolateCandy karakum = new Karakum(15, 10, ChocolateType.White);
        ChocolateCandy kinder2 = new Kinder();

        Present happybox = new Present();
        happybox.addCandy(karakum);
        happybox.addCandy(kinder);
        happybox.addCandy(kinder2);
        happybox.addCandy(trufel);

        happybox.sortedByWeight().stream()
                .forEach(x -> System.out.println(x));

        System.out.println(happybox.searchCandy(kinder));

        happybox.getChocolateCandies().stream()
                .forEach(x -> System.out.println(x));

    }
}
