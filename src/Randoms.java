import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;

    public Randoms(int min, int max) {

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int a;
            int next = random.nextInt();

            @Override
            public boolean hasNext() {
                if (a == 100) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Integer next() {
                if (a == 100) {
                    return a;
                } else {
                    return next;
                }
            }
        };
    }
}