package A;

public class Car {
    private String name = "Honda City";
    private String model = "2021";
    private String color = "Blue";
    private int tyres = 4;

    public static void main(String[] args) {
        Car Honda = new Car();
        System.out.println("Name is "+ Honda.name);
        System.out.println(Honda.model);
        System.out.println(Honda.color);
        System.out.println(Honda.tyres);
    }
}
