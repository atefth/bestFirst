/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfirst;

/**
 *
 * @author atef
 */
class Tree {
    
    static Node root;
    static Node target;
    
    public Tree(){
        
        this.create();
        
    }
    
    public final void create(){
        
        Tree.root = new Node(2, 4);
        
        Node firstNode = new Node(3, 2);
        Node secondNode = new Node(1, 1);
        Node thirdNode = new Node(4, 3);
        Node fourthNode = new Node(5, 1);
        
        Node first1Node = new Node(1, 1);
        Node first2Node = new Node(3, 2);
        
        Node second1Node = new Node(1, 1);  
        
        Node third1Node = new Node(4, 3);
        Node third2Node = new Node(3, 4);
        Node third3Node = new Node(2, 1);
        
        Tree.root.append(firstNode);
        Tree.root.append(secondNode);
        Tree.root.append(thirdNode);
        Tree.root.append(fourthNode);
        
        firstNode.append(first1Node);
        firstNode.append(first2Node);
        
        secondNode.append(second1Node);
        
        thirdNode.append(third1Node);
        thirdNode.append(third2Node);
        thirdNode.append(third3Node);
        
        fourthNode.append(second1Node);
        
        first1Node.append(third2Node);
        
        first2Node.append(secondNode);
        first2Node.append(third1Node);
        
        second1Node.append(first1Node);
        
        third1Node.append(fourthNode);
        third1Node.append(second1Node);
        third1Node.append(firstNode);
        
        third2Node.append(first1Node);
        third2Node.append(firstNode);
        third2Node.append(third1Node);
        third2Node.append(third2Node);
        
        third3Node.append(fourthNode);
        
        Tree.target = third2Node;
    }
    
}
