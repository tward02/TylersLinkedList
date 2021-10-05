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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("I");
        list.add("hope");
        list.add("this");
        list.add("works!");
        String string = list.toString();
        System.out.println(string);
    }
    
}
