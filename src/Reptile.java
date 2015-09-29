
public abstract class Reptile extends Animal {

    @Override
    public boolean isWarmBlooded() {
        return false;
    }

    @Override
    public void speak() {
        System.out.println("argh");
    }
}
