
package domain;

import java.io.Serializable;


public class Books extends Material implements Serializable{

    private String author;
    private String editorial;
    private  boolean digital;

    public Books() {
        super();
        this.author = "";
        this.editorial = "";
        digital = false;
    }

    public Books(String author, String editorial, String name, String code, int year, boolean digital) {
        super(name, code, year);
        this.author = author;
        this.editorial = editorial;
        this.digital = digital;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Books{" + "author=" + author + ", editorial=" + editorial + ", digital=" + digital + '}';
    }
}
