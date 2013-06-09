/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfirst;

/**
 *
 * @author atef
 */
public class BestFirst {

    private Tree tree;
    private Node currentNode;
    
    public BestFirst(){
        
        tree = new Tree();
        currentNode = Tree.root;
        
    }
    
    public Node chooseBestNode(){
        
        if (currentNode.getTotalNodes() > 0){
        
            Node[] children = currentNode.getSuccessors();            
            int minCost = children[0].getCost();
            Node minCostNode = children[0];
            for (int i = 1; i < children.length; i++){

                if ((children[i] != null) && (children[i].getCost() < minCost)){
                    minCost = children[i].getCost();
                    minCostNode = children[i];
                }

            }
            return minCostNode;
            
        }else{
            
            return null;
            
        }
    }
    
    public boolean search(){
        
        if (check()){
            
            return true;
            
        }else{
            
            Node nextNode = chooseBestNode();
            currentNode = nextNode;
            return search();
            
        }
        
    }
    
    public boolean check(){
        
        if (currentNode.equals(Tree.target))
            return true;
        else
            return false;
        
    }

}
