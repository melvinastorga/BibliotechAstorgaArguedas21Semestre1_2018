
package file;

import domain.Books;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Books_File {
    
    //Escribe en archivo books 
    public String writeBooks(Books book){ 
        String message = "";
        File fl = new File("Books.dat"); 
        try{
             
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl,true));
            
            oos.writeObject(book);
            System.out.println(" ll   "
            +book.toString());
            message = "El libro fue agregado";
        }
        catch(Exception ex){
           message = "No se pudo agregar el libro";
        }
        return message;
    }
    
    //Retorna un arreglo de libros
    public void getArrayBooks() throws FileNotFoundException{
       
        File fl = new File("Books.dat"); 
        Object ob = new Object();
        ObjectInputStream ois;
        FileInputStream fis = new FileInputStream(fl);
        try{
           
            
            for(;;){
                ois = new ObjectInputStream(fis);
                ob= (Books)ois.readObject();
                if(ob instanceof Books){
                    
                    System.out.println(((Books)ob).toString());
                
                }   
               
            }
            
            
            
            
            
        }
        catch(Exception ex){
            
            System.out.println("    end file");
        }
       
    }
    
    //Muestra el arreglo de libros
   
    }

