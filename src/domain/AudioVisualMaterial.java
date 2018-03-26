
package domain;


public class AudioVisualMaterial extends Material {
    
    private String brand;
    private String funtion;

    public AudioVisualMaterial() {
        super();
        this.brand = "";
        this.funtion = "";
    }

    public AudioVisualMaterial(String brand, String funtion, String name, String code, int quantity) {
        super(name, code, quantity);
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
    
    

}
