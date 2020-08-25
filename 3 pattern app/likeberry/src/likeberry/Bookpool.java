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
public class Bookpool {
    private ArrayList<Book> store = new ArrayList<Book>();
    
    public Bookpool(){
        Book b1 = new Book();
        b1.setName("Princess SPA");
        b1.setAuthor("Frame");
        store.add((Book) b1.clone());
        store.add((Book) b1.clone());
        store.add((Book) b1.clone());
        
    }
    
    
    public Book use(){
        if (getStore().size() != 0){
            return getStore().remove(getStore().size() - 1);
        }
        return null;
    }
    
    public void free(Book b1){
        getStore().add(b1);
    }

    /**
     * @return the store
     */
    public ArrayList<Book> getStore() {
        return store;
    }
}
