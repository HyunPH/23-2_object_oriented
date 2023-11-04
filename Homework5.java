package ch6;

class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    Computer(String cpu, String memory, String hd, String  color, String power){
        this.cpu = cpu;
        this.memory =memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.printf(" CPU: %s\n", cpu);
        System.out.printf(" Memory: %s\n", memory);
        System.out.printf(" HDD: %s\n", hd);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}
class Monitor{
    private String monitorSize;
    private String color;
    private String power;

    Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.printf(" Size: %s\n", monitorSize);
        System.out.printf(" Color: %s\n", color);
        System.out.printf(" Power: %s\n", power);
    }
}

class PersonalComputer{
    Computer computer;
    Monitor monitor;

    PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }
    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    public void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }
}


public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(
                new Computer(" Core i7","16GB","2TB","White","500W"),
                new Monitor("24 inch","Black","45W")
        );
        pc.turnOn();
        pc.printInfo();
    }
}
