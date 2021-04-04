package exercise;

public class Up implements Exercise{
    String name = "Get Up";

    @Override
    public void execute() {
        System.out.println(name);
    }
    @Override
    public String getName() {
        return name;
    }
}
