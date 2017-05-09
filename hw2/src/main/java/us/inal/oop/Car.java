package us.inal.oop;

import java.io.Serializable;

/**
 * Created by alpereninal on 09/10/16.
 * To serialize an object means to convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object.
 */
public class Car implements Serializable {

    private String brand;
    private String model;
    private int modelYear;
    private String color;
    private String plateNo;

    public Car() {
    }

    public Car(String brand, String model, int modelYear, String color, String plateNo) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.color = color;
        this.plateNo = plateNo;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", color='" + color + '\'' +
                ", plateNo='" + plateNo + '\'' +
                '}';
    }
}
