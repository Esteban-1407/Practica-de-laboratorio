package builderLaboratory;

public class VehicleBuilder implements Builder{
    private Vehicle vehicle;
    public VehicleBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        vehicle = new Vehicle();
    }

    @Override
    public void setVehicleType(String type) {
        vehicle.setType(type);

    }

    @Override
    public void setNumberWheels(Integer numberWheels) {
        vehicle.setNumberwheels(numberWheels);
    }

    @Override
    public void setModel(String model) {
        vehicle.setModel(model);
    }

    @Override
    public void setColor(String color) {
        vehicle.setColor(color);
    }

    @Override
    public Vehicle getResult() {
        return this.vehicle;
    }

}
