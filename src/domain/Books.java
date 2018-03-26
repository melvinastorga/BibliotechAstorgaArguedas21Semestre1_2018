
package domain;


public class Books extends Material {

    private String author;
    private String editorial;

    public Books() {
        super();
        this.author = "";
        this.editorial = "";
    }

    public Books(String author, String editorial, String name, String code, int quantity) {
        super(name, code, quantity);
        this.author = author;
        this.editorial = editorial;
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
        return "Books{" + "author=" + author + ", editorial=" + editorial + '}';
    }

    
    
    
    
}
