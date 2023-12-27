package Fila;

import java.util.Queue;
import java.util.LinkedList;
public class Fifo {
  public static void main(String args[]) {
	  
	  Queue<String> carros = new LinkedList<>();
      
		carros.add("HRV");
		carros.add("Golf");
		carros.add("Polo");
		carros.add("Camaro");
		carros.add("Tiggo 3x");
		
		System.out.println("topo: " + carros.peek());
		System.out.println("________________________ \n");
		System.out.println("topo: " + carros.poll());
		System.out.println("________________________ \n ");
		System.out.println(carros);
		System.out.println("________________________ \n ");
		System.out.println(carros.isEmpty()? "Pilha vazia": "Pilha com Elementos");
		System.out.println("________________________ \n");
		
		for(String c: carros) {
			System.out.println(c);
		}
		
		System.out.println("________________________ \n ");
		carros.clear();
		System.out.println(carros.isEmpty()? "Fila vazia": "Fila com Elementos");
  }
}
