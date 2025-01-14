package Helpers;

import java.util.Random;

public class RandomHelper {
    private Random random = new Random();

    public <L> L list(L[] list) {
        return list[random.nextInt(list.length)];
    }
}
