package br.unviates.main;

public class DoublyLinkedList {
	
    static Node head; 
    
    static class Node {  
        int data;  
        Node next;  
        Node prev;  
    };

    /**
     * Inserir novo no na lista
     * @param value
     */
    public void addNode(int value) {  
        
    	/// Se lista vazia, primeiro no vira cabecalho 
        if (head == null) {  
            Node new_node = new Node();  
            new_node.data = value;  
            new_node.next = new_node.prev = new_node;  
            head = new_node;  
            return;  
        }  
   
          Node last = (head).prev;
   
        Node new_node = new Node();  
        new_node.data = value;  
   
        new_node.next = head;  
   
        (head).prev = new_node;  
   
        new_node.prev = last;  
   
        last.next = new_node;  
    }  
   
    /**
     * Imprimir lista
     */
    public void print()   {  
        Node temp = head;  
        /// Percorrer a lista em sentido ascendente
        while (temp.next != head)  
        {  
            System.out.printf("%d ", temp.data);  
            temp = temp.next;  
        }  
        System.out.printf("%d ", temp.data);  
   
        /// Percorrer a lista em sentido descedente
        System.out.printf("\nPercorrendo lista duplamente encadeada ao contrario: ");  
        Node last = head.prev;  
        temp = last;  
        while (temp.prev != last)  
        {  
            System.out.printf("%d ", temp.data);  
            temp = temp.prev;  
        }  
        System.out.printf("%d ", temp.data);  
    }
}
