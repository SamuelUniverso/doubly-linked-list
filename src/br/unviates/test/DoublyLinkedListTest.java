package br.unviates.test;

import org.junit.Test;

import br.unviates.main.DoublyLinkedList;

public class DoublyLinkedListTest {
	
	@Test
	public void testaListaDuplamenteEncadeada()
	{
		DoublyLinkedList list = new DoublyLinkedList();  
   
        // add nodes to the list  
        list.addNode(40);  
        list.addNode(50);  
        list.addNode(60);  
        list.addNode(70);  
        list.addNode(80);  
   
        System.out.printf("Lista duplamente encadeada: ");  
        list.print();  
	}
}
