/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likeberry;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vacharavat
 */
public class Book implements Cloneable{
    
    private String name;
    private String author;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    @Override
    public Object clone(){
        Object clone = null;
        try {           
            clone = super.clone();
            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    
    
    
}
