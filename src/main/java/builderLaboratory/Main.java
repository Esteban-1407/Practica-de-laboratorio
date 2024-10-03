package builderLaboratory;

public class Main {
    public static void main(String[] args) {
        VehicleDirector director = new VehicleDirector();
        VehicleBuilder builder = new VehicleBuilder();

        // Construimos un carro
        director.constructCar(builder);
        Vehicle car = builder.getResult();
        System.out.println(car);

        // Construimos una moto
        director.constructMotorBike(builder);
        Vehicle motorBike = builder.getResult();
        System.out.println(motorBike);

        // Construimos un bus
        director.constructorBus(builder);
        Vehicle bus = builder.getResult();
        System.out.println(bus);
    }

}
