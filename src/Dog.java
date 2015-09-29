
public class Dog extends Mammal {

    public int numberOfPaws;

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void speak() {
        System.out.println("woof");
    }

}
