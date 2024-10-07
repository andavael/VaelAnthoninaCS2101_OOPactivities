public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M');
        Car car2 = new Car("blue", 50000.00, 'L');
        
        System.out.println("\n" + car1);
        System.out.println(car2);

        System.out.println("\n***********************************************");
        System.out.println("                TESTING SETTERS                ");
        System.out.println("***********************************************");

        car1.setColor("black");
        car1.setPrice(28000.99);
        car1.setSize('S');
        
        System.out.println("Updated Car 1: " + car1);

        System.out.println("\n***********************************************");
        System.out.println("                TESTING GETTERS                ");
        System.out.println("***********************************************");
        
        System.out.println("Car 2 Color : " + car2.getColor());
        System.out.println("Car 2 Price : " + car2.getPrice());
        System.out.println("Car 2 Size  : " + car2.getSize() + "\n");
    }
}