/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likeberry;

import java.util.Scanner;

/**
 *
 * @author Vacharavat
 */

public class Likeberry {
    Scanner sc = new Scanner(System.in);
    private int userchoice;
    /**
     * @param args the command line arguments
     */
    
    public void userinput(){
        System.out.println("Library have only " + BookshelfSingleton.getInstance().getBp().getStore().size() + " book");
        System.out.println("Now you have " + BookshelfSingleton.getInstance().getUserbook().size() + " book" );
        System.out.println("");
        System.out.println("What do you want today? (1 to borrow or 2 to return book)");
        userchoice = sc.nextInt();
        
        switch(userchoice){
            case 1:
                BookshelfSingleton.getInstance().borrow();
                break;
            case 2:
                BookshelfSingleton.getInstance().returnbook();
                break;
            default:
                System.out.println("try again");
        }
        
        this.userinput();
    }
    public static void main(String[] args) {
        Likeberry lb = new Likeberry();
        lb.userinput();
    }
    
}
