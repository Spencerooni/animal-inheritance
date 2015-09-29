import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Penguin myPenguin = new Penguin();

        ArrayList<Animal> values = new ArrayList<Animal>();

        values.add(myCat);
        values.add(myDog);
        values.add(myPenguin);

        for (Animal value : values)
        {
            value.speak();
        }

    }
}
