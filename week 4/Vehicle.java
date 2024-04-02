class Vehicle{
    public void noOfWheels(){
        System.out.println("Every wheel has at least one wheel");
    }
    public void EngineType(){
        System.out.println("Default is petrol engine");
    }
    public void color(){
        System.out.println("Not specified");
    }
}
class Car extends Vehicle {
    @Override
    public void noOfWheels(){
        System.out.println("Four wheels");
    }
    public void color(){
        System.out.println("White color");
    }
}
class Auto extends Vehicle{
    @Override
    public void noOfWheels(){
        System.out.println("Three wheels");
    }
    public void color(){
        System.out.println("Yellow color");
    }
    public void EngineType(){
        System.out.println("Default is disele engine");
    }
}
class VehicleDemo{
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Properties of car");
        c.color();
        c.EngineType();
        c.noOfWheels();
        System.out.println("..........................\n");
        Auto a = new Auto();
        System.out.println("Properties of Auto");
        a.color();
        a.EngineType();
        a.noOfWheels();
    }
}