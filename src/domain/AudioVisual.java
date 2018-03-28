
package domain;

import java.io.Serializable;


public class AudioVisual extends Material implements Serializable{
    
    private String brand;
    private String funtion;

    public AudioVisual() {
        super();
        this.brand = "";
        this.funtion = "";
    }

    public AudioVisual(String brand, String funtion, String name, String code, int year) {
        super(name, code,year);
        this.brand = brand;
        this.funtion = funtion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }

    @Override
    public String toString() {
        return "AudioVisualMaterial{" + "brand=" + brand + ", funtion=" + funtion + '}';
    }
    
    public int sizeInBytes(){
        return this.brand.length() * 2 +
               this.funtion.length() * 2 +
               super.sizeInBytes();
    }

}
