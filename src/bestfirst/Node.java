/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfirst;

/**
 *
 * @author atef
 */
class Node {
    
    private int cost;
    private Node[] successors;
    private int totalNodes;
    private int size;
    
    public Node(int c, int len){
        
        cost = c;
        totalNodes = len;
        successors = new Node[totalNodes];
        size = 0;
        
    }
    
    public boolean append(Node n){
        
        if (size < totalNodes){
            
            successors[size] = n;
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    public void setCost(int val){
        
        this.cost = val;
        
    }
    
    public int getCost(){
        
        return this.cost;
        
    }
    
    public Node[] getSuccessors(){

        return this.successors;
        
    }
    
    public int getTotalNodes(){
        
        return this.totalNodes;
        
    }
    
}
