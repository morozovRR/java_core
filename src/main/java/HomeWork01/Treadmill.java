package HomeWork01;

public class Treadmill {

    protected int isLong;

    public Treadmill(int isLong) {
        this.isLong = isLong;
    }

    public int getIsLong() {
        return isLong;
    }

    public void setIsLong(int isLong) {
        this.isLong = isLong;
    }

    public int getRanTreadmill(CanRan runner) {
        return runner.ranOverTreadmill(this);
    }
}
