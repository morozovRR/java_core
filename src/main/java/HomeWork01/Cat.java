package HomeWork01;

public class Cat extends Participant implements CanJump, CanRan {

    public Cat(String name, int ran, int jump, int energy) {
        super(name, ran, jump, energy);
    }

    public int jumpOverWall(Wall walls) {
        if (jump < walls.getHeight()) {
            System.out.println(this.name + " не прыгнул на " + walls.getHeight() + "м");
        } else {
            System.out.println(this.name + " прыгнул на " + walls.getHeight() + "м");
        }
        return this.jump - walls.getHeight();
    }

    public int ranOverTreadmill(Treadmill treadmills) {
        if (ran < treadmills.getIsLong()) {
            System.out.println(this.name + " не смог пробежать " + treadmills.getIsLong() + "м");
        } else {
            System.out.println(this.name + " пробежал " + treadmills.getIsLong() + "м");
        }
        return this.ran - treadmills.getIsLong();
    }

}
