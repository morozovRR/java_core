package HomeWork02;

public class MyArrayDataException extends Exception {
    public int x;
    public int y;

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
