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
        Node first1Node = new Node(1, 1);
        Node first2Node = new Node(3, 2);
        Node second1Node = new Node(1, 1);        
        Node third1Node = new Node(4, 3);
        Node third2Node = new Node(1, 4);
        Node third3Node = new Node(6, 1);
        Node first1Node1 = new Node(5, 2);
        
        Tree.root.append(third3Node);
        Tree.root.append(secondNode);
        Tree.root.append(second1Node);
        Tree.root.append(first1Node);
        firstNode.append(third2Node);
        firstNode.append(first2Node);
        secondNode.append(first1Node1);
        thirdNode.append(third1Node);
        thirdNode.append(first1Node);
        thirdNode.append(thirdNode);
        first1Node.append(firstNode);
        first2Node.append(first1Node1);
        first2Node.append(second1Node);
        second1Node.append(first2Node);
        third1Node.append(Tree.root);
        third1Node.append(third3Node);
        third1Node.append(first1Node1);
        third2Node.append(first1Node);
        third2Node.append(firstNode);
        third2Node.append(third1Node);
        third2Node.append(thirdNode);
        third3Node.append(secondNode);
        first1Node1.append(second1Node);
        first1Node1.append(third2Node);
        
        Tree.target = first1Node1;
    }
    
}
