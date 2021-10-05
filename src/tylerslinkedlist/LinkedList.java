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
public class LinkedList {
    
    private int size;
    private Node head;

    public LinkedList() {
        size = 0;
        head = null;
    }

    public int size() {
        return size;
    }
    
    public Object get(int index){
        if (index < 0) {
            return null;
            
        }
        Node current = null;
        if (head != null) {
            current = head.getPointer();
            for (int i = 0; i < index; i++) {
                if (current.getPointer() == null) {
                    return null;
                }
                current = current.getPointer();
            }
            return current.getData();
        }
        return current;
    }
    
    public void add(Object object){
        if (head == null) {
            head = new Node(object);
            
        }
        Node temp = new Node(object);
        Node current = head;
        
        if (current != null) {
            while(current.getPointer() != null){
                current = current.getPointer();
                
            }
            current.setPointer(temp);
            
        }
        size++;
        
    }
    
    public void add(Object object, int index){
        Node temp = new Node(object);
        Node current = head;
        if (current != null) {
            for (int i = 0; i < index && current.getPointer() != null; i++) {
                current = current.getPointer();
                
            }
            
        }
        temp.setPointer(current.getPointer());
        current.setPointer(temp);
        size++;
    }
    
    public boolean remove(int index){
        if (index > size || index < 1) {
            return false;
        }
        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getPointer() == null) {
                    return false;
                }
                current = current.getPointer();
                
            }
            current.setPointer(current.getPointer().getPointer());
            size--;
            return true;
            
        }
        return false;
    }
    
    
    @Override
   public String toString() {
		String output = "";
 
		if (head != null) {
			Node crunchifyCurrent = head.getPointer();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.getData().toString() + "]";
				crunchifyCurrent = crunchifyCurrent.getPointer();
			}
 
		}
		return output;
	}
    
    
}
