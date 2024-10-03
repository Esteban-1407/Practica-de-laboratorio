package builderLaboratory;

public class VehicleDirector {
    public void constructCar(VehicleBuilder builder){
        builder.reset();
        builder.setVehicleType("Carro deportivo");
        builder.setColor("Amarillo");
        builder.setModel("Audi 2017");
        builder.setNumberWheels(4);
    }
    public void constructMotorBike(VehicleBuilder builder){
        builder.reset();
        builder.setVehicleType("Moto");
        builder.setColor("Rojo");
        builder.setNumberWheels(2);
        builder.setModel("Cross");
    }
    public void constructorBus(VehicleBuilder builder){
        builder.reset();
        builder.setVehicleType("Bus");
        builder.setColor("Rojo");
        builder.setModel("Bus 2023");
        builder.setNumberWheels(4);
    }

}
