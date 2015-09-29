
public abstract class Bird extends Animal {

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public boolean isWarmBlooded() {
        return true;
    }

    @Override
    public void speak() {
        System.out.println("twit");
    }

    public abstract boolean canFly();
}
