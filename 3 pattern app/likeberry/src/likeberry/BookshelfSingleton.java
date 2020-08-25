/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likeberry;

import java.util.ArrayList;

/**
 *
 * @author Vacharavat
 */
public class BookshelfSingleton {
    private Bookpool bp;
    private ArrayList<Book> userbook = new ArrayList<Book>();
    
    private static BookshelfSingleton instance = null;
    
    private BookshelfSingleton(){
        bp = new Bookpool();
    }
    
    public static BookshelfSingleton getInstance(){
        if (instance == null)
            instance = new BookshelfSingleton();
        return instance;
    }
    
    public void borrow(){
        Book checkbook = getBp().use();
        if (checkbook != null){
            getUserbook().add(checkbook);
        }
        else{
            System.out.println("Just return some book please");
        }
        
    }
    
    public void returnbook(){
        if (getUserbook().size() != 0){
            getBp().free(getUserbook().remove(getUserbook().size() - 1));
        }
        else{
            System.out.println("You have no book to return");
        }
    }

    /**
     * @return the bp
     */
    public Bookpool getBp() {
        return bp;
    }

    /**
     * @return the userbook
     */
    public ArrayList<Book> getUserbook() {
        return userbook;
    }
    
    
  
}
