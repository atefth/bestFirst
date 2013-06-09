/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfirst;

/**
 *
 * @author atef
 */
public class Driver {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BestFirst b = new BestFirst();
        if (b.search())
            System.out.println("Node was found!");
        else
            System.out.println("Node was not found!");
        
    }
    
}
