
public class Cat extends Mammal {

    public int numberOfWhiskers;

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void speak() {
        System.out.println("meow");
    }

    public String toString()
    {
        return "cat with details: " + this.numberOfWhiskers + " whiskers";
    }

}
