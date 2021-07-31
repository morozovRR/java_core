package HomeWork03;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] weapon = {"АК-47", "Макарова", "Desert Egle", "С-300"};
        System.out.println("Было: " + Arrays.toString(weapon));
        elementReplace(weapon, 0, 2);
        System.out.println("Стало: " + Arrays.toString(weapon));


        Apple apple = new Apple();
        Orange orange = new Orange();
        Box box = new Box(50, apple.getCount());
        Box box1 = new Box(40, orange.getCount());
        apple.setCount(15);
        orange.setCount(25);

        System.out.println();

        box.takingFruit(apple.getCount(), apple.toString());
        box.boxWeight(apple.getWeight(), apple.getCount());
        box1.takingFruit(orange.getCount(), orange.toString());
        box1.boxWeight(orange.getWeight(), orange.getCount());

        System.out.println("Сравнение веса ящиков: " + box.compare(box, box1));

        System.out.println();

        System.out.println("Было в ящике box " + box.getCapacity() + ", в ящике box1 " + box1.getCapacity());
        toSwap(box, box1);
        System.out.println("Стало в ящике box " + box.getCapacity() + ", в ящике box1 " + box1.getCapacity());


    }


    private static <T> void elementReplace(T[] arr, int a, int b) {
        T x = arr[a];
        arr[a] = arr[b];
        arr[b] = x;
    }

    public static void toSwap(Box box, Box box1) {
        int a = box.getCapacity();
        int b = box1.getCapacity();
        int bowl = a;
        a = b;
        b = bowl;
        box.setCapacity(a);
        box1.setCapacity(b);

    }


}
