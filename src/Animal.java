
public abstract class Animal {

    public String colour;
    public float height;
    public float weight;
    public boolean livesIndoor;
    public String description;
    public Gender gender;

    public void sleep()
    {
        System.out.println("zzz zzz zzz...");
    }

    public abstract int getNumberOfLegs();

    public abstract boolean isWarmBlooded();

    public abstract void speak();

}
