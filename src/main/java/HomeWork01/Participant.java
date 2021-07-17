package HomeWork01;

public abstract class Participant {
    protected String name;
    protected int ran;
    protected int jump;
    protected int energy;

    public Participant(String name, int ran, int jump, int energy) {
        this.name = name;
        this.ran = ran;
        this.jump = jump;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRan() {
        return ran;
    }

    public void setRan(int ran) {
        this.ran = ran;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void justRunning(int ran) {
        if (ran < 0 || ran > this.ran) {
            System.out.println("Не корректное значение! Я не могу пробежать меньше 0 и больше " + this.ran);
        } else {
            this.ran = ran;
            System.out.println("Я " + this.name + ", я ролбежал " + ran);
        }
    }

    public void jumping(int jump) {
        if (jump < 0 || jump > this.jump) {
            System.out.println("Не корректное значение");
        } else {
            this.jump = jump;
            System.out.println("Я " + this.name + ", я прыгнул на " + jump);
        }
    }


}
