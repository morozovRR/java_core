package HomeWork03;

public class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }

    public Apple(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "Яблоки";
    }
}
