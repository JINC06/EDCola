/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.julionava.edcola;

import javax.swing.JOptionPane;

/**
 *
 * @author julio.nava
 */
public class EDCola {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        /*Cola queue = new Cola();
        
        queue.enqueue("3");
        queue.enqueue("5");
        queue.enqueue("7");
        queue.enqueue("8");
        queue.enqueue("2");
        
        queue.displayQueue();*/
        
        showMenu();
    }
    
    public static void showMenu(){
        int option = 0;
        Cola queue = new Cola();
        
        do {
            try {
                option = Integer.parseInt( JOptionPane.showInputDialog(null, ""
                                + "1.- Enqueue(element)\n2.- dequeue()\n"
                                + "3.- Is Empty?\n4.- front()\n"
                                + "5.- size()\n"
                                + "6.- displayQueue()\n"
                                + "7.- Exit\n"
                                + "Input one option:\n") );
                switch (option) {
                    case 1:
                        String data = JOptionPane.showInputDialog(null, "Input the data:");
                        queue.enqueue(data);
                        break;
                    case 2:
                        if(!queue.isEmpty()){
                            String elementRemove = queue.dequeue();
                            JOptionPane.showMessageDialog(null, "Element removed from the queue: " + elementRemove);
                        }else{
                            JOptionPane.showMessageDialog(null, "The stack is empty");
                        }
                        break;
                    case 3:
                        if(queue.isEmpty()){
                            JOptionPane.showMessageDialog(null, "The queue IS EMPTY");
                        }else{
                            JOptionPane.showMessageDialog(null, "The queue IS NOT EMPTY");
                        }
                        break;
                    case 4:
                        if(!queue.isEmpty()){
                            String elementFront = queue.front();
                            JOptionPane.showMessageDialog(null, "The front element is: " + elementFront);
                        }else{
                            JOptionPane.showMessageDialog(null, "The queue is empty");
                        }
                        break;
                    case 5:
                        int total = queue.size();
                        JOptionPane.showMessageDialog(null, "The total items in the queue is: " + total);
                        break;
                    case 6:
                        if(queue.isEmpty()){
                            JOptionPane.showMessageDialog(null, "The queue is empty");
                        }else{
                            queue.displayQueue();
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Program finished.");
                        break;
                }
            }catch(Exception e){
                System.out.println("Error. Ingrese un entero: " + e.getMessage());
            }
        }while(option != 7);
        
    }
    
    
}
