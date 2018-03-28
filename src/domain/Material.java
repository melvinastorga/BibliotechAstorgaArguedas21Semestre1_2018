package domain;

import java.io.Serializable;


public class Material implements Serializable{
    
    private String name;
    private String code;
    private int year;

    public Material() {
        this.name = "";
        this.code = "";
        this.year = 0;
    }

    public Material(String name, String code, int year) {
        this.name = name;
        this.code = code;
        this.year = year;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Material{" + "name=" + name + ", code=" + code + ", quantity=" + year + '}';
    }

    public int sizeInBytes(){
        return this.code.length() * 2 +
               this.name.length() * 2 +
               4;
    }
}
