package exercise;

public class Down implements Exercise{
    String name = "Lay Down";
    @Override
    public void execute() {
        System.out.println(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
