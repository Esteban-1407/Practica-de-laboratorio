package builderLaboratory;

public interface Builder {
    void reset();
    void setVehicleType(String type);
    void setNumberWheels(Integer numberWheels);
    void setModel(String model);
    void setColor(String color);
    Vehicle getResult();
}
