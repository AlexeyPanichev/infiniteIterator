import java.util.Iterator;
import java.util.Random;

class RandomIterator implements Iterator<Integer> {
    private Random random;
    private int min;
    private int max;
    private int current;

    public RandomIterator(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
        this.current = random.nextInt(max - min + 1) + min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int oldCurrent = current;
        current = random.nextInt(max - min + 1) + min;
        return oldCurrent;
    }
}