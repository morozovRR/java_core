package HomeWork01;

public class Wall {

    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getJumpWall(CanJump jumper) {
        return jumper.jumpOverWall(this);
    }
}
