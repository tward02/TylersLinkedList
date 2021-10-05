/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tylerslinkedlist;

/**
 *
 * @author tyler
 */
public class Node {

    private Object data;
    private Node pointer;
    
     public Node(Object data) {
        this.data = data; 
        pointer = null;
    }
     
    public Node(Object object, Node pointer){
        this.pointer = pointer;
        this.data = object;
    }
    
    public void setData(Object data){
        this.data = data;
    }
    
    public Object getData(){
        return this.data;
    }
    
    public void setPointer(Node pointer){
        this.pointer = pointer;
        
    }
    
    public Node getPointer(){
        return this.pointer;
    }
    
    
}
