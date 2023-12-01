/**
 * Implementazione di uno stack utilizzando un array
 * in futuro sarà possibile parametrizzare la classe per poterla
 * utilizzare con tipi parametrizzati
 */

import java.util.Arrays;

public class StackArray {
	
	// ATTRIBUTI
	private Object[] stack;
	private int testa;
	private int dim = 20;
	
	// COSTRUTTORI
	/**
	 * costruttore di default
	 */
	public StackArray() {
		this.testa = 0;
		this.stack = new Object[dim];
	}
	
	/**
	 * Costruttore con dimensione
	 * @param dim specificare una dimensione di partenza
	 */
	public StackArray(int dim) {
		this.testa = 0;
		this.dim = dim;
		this.stack = new Object[dim];
	}
	
	// METODI
	public boolean isEmpty() {
		boolean emp = false;
		if(this.testa == 0) {
			emp = true;
		}
		return emp;
	}
	
	public void push(Object o) {
		if(isFull() == false) {
			stack[testa] = o;
			testa++;
		}else {
			addDim();
			stack[testa] = o;
			testa++;
		}
	}
	
	public Object pop() {
		Object o = null;
		if(isEmpty() == false) {
			o = stack[testa-1];
			testa--;
		}
		return o;
	}
	
	public Object peek() {
		return stack[testa];
	}
	
	private boolean isFull() {
		boolean full = false;
		if(testa == stack.length) {
			full = true;
		}
		return full;
	}
	
	private void addDim() {
		this.stack = Arrays.copyOf(stack, dim+1);
	}
	
	public void print() {
		for(int i = testa-1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
		System.out.println("\n");
	}
}
