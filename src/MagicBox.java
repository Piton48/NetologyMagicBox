import java.util.Random;

public class MagicBox<T> {
    public int maxCapacity;
    protected int counter = 0;
    protected T[] items;

    public MagicBox(int capacity) {
        this.maxCapacity = capacity;
        items = (T[]) new Object[maxCapacity];
    }

    public boolean add(T item) {
        if (this.counter < maxCapacity) {
            this.items[this.counter] = item;
            counter++;
            return true;
        }
        return false;
    }

    public T pick() {
        if ((this.counter) == (this.maxCapacity)) {
            Random random = new Random();
            return items[random.nextInt(maxCapacity)];
        } else {
            throw new RuntimeException("Магическая Коробка не заполнена!");
        }
    }
}
