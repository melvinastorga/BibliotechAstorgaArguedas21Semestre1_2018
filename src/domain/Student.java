
package domain;


public class Student {
    
    private String name;
    private String code;
    private String career;
    private int year;

    public Student() {
        this.name = "";
        this.code = "";
        this.career = "";
        this.year = 0;
    }

    public Student(String name, String code, String career, int year) {
        this.name = name;
        this.code = code;
        this.career = career;
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

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", code=" + code + ", career=" + career + ", year=" + year + '}';
    }
    
    

}
