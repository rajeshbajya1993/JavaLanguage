package oops.collectionFramework;

import java.util.Iterator;

public class List_Iterator_Example<E>  {

	private static final int MAX_SIZE=16;
	private Object [] arr;
	private int size=0;
	private int lastIndex=0;
	public void addElement(E e){
		
		if(lastIndex+1>=MAX_SIZE){
			throw new RuntimeException("Array is already full");
		}

		arr[lastIndex++]=e;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index<0 || index>=lastIndex ){
			return null;
		}else{
			return (E) arr[index];
		}
	}
	public List_Iterator_Example() {
		arr = new Object[16];
	}
	
	Iterator<E> iterator(){
		return new Itr();
	}
	
	public int getSize(){
		return size;
	}
	
	class Itr implements Iterator<E>{

//		int 
		int cursor=0;
		@Override
		public boolean hasNext() {
			if(cursor<lastIndex){
				return true;
			}
			return false;
		}

		@SuppressWarnings("unchecked")
		@Override
		public E next() {
			if(cursor<lastIndex){
				return (E) arr[cursor++];
			}
			else{
				return null;
			}
		}
		
	}
	
	
}
