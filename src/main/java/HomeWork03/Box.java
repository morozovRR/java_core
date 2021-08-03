package HomeWork03;

public class Box extends Fruit {
    private int capacity;

    public Box(int capacity, int count) {
        super(count);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void takingFruit(int a, String name) {
        setCapacity(a);
        System.out.println("В ящике " + name + ": " + a + "шт");
    }

    public void boxWeight(float weight, int count) {
        if (count == 0) {
            System.out.println("Ящик пуст");
        } else {
            System.out.println("Вес ящика: " + count * weight);
        }
    }

    boolean compare(Box box, Box box1) {
        return box == box1;
    }
}



