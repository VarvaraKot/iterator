import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected final Random random = new Random();
    private final Iterator<Integer> iterator;

    public Randoms(int min, int max) {
        iterator = new IntegerIterator(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return iterator;
    }

    private class IntegerIterator implements Iterator<Integer> {
        int min;
        int max;

        private IntegerIterator(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max + 1 - min);

        }
    }
}