package backend;

import entity.CPU;
import entity.Car;

public class Exercise03 {
    public static void question01(){
        CPU cpu = new CPU(1000);
        CPU.Processor processor = cpu.new Processor(12, "Intel");
        System.out.println(processor.getCache());
        CPU.Ram ram = cpu.new Ram(8, "Samsung");
        System.out.println(ram.getClockSpeed());
    }

    public static void question02() {
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine("Crysler");
        System.out.println("Động cơ " + engine.getEngineType());
    }
}
