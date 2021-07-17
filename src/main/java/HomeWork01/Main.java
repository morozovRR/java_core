package HomeWork01;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Джон Конар", 500, 60, 100);
        Cat cat = new Cat("Бабулех", 100, 45, 100);
        Robot robot = new Robot("Т-3000", 700, 30, 100);

        Wall[] walls = {new Wall(10), new Wall(20), new Wall(30), new Wall(40), new Wall(50)};
        Treadmill[] treadmills = {new Treadmill(50), new Treadmill(100), new Treadmill(200)};

        for (Wall wall : walls) {
            wall.getJumpWall(human);
            wall.getJumpWall(cat);
            wall.getJumpWall(robot);
        }

        System.out.println("_________________________");

        for (Treadmill treadmill : treadmills) {
            treadmill.getRanTreadmill(human);
            treadmill.getRanTreadmill(cat);
            treadmill.getRanTreadmill(robot);
        }
    }
}
