package oops.ALL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class JavaGenerics<E> {
	E element;
	private List<JavaGenerics<E>> list=new ArrayList<>();
	
	JavaGenerics(E element){
		this.element=element;
	}
	
	public List<JavaGenerics<E>> addElement(JavaGenerics<E> obj){
		
		list.add(obj);
	
		
		return list;
	}
	

	public static void main(String[] args) {
//		JavaGenerics<String> jv = new JavaGenerics<>("Rajesh");
//		JavaGenerics<String> jv1 = new JavaGenerics<>("Hello");
//		JavaGenerics<Integer> jv2 = new JavaGenerics<>(12);
//		JavaGenerics<Double> jv3 = new JavaGenerics<>(1.3);
//		JavaGenerics<Double> jv4 = new JavaGenerics<>(1.7);
//		jv4.addElement(jv3);
//		List<JavaGenerics<Double>> tt =jv4.addElement(jv4);
//		Iterator<JavaGenerics<Double>> t = tt.iterator();
//		while(t.hasNext()){
//			System.out.println(t.next().element);
//		}
		
		ConcurrentHashMap<String,String> t;
		
		
	}
	public void loopBreaker(){
		search :
			for(int i=0;i<10;i++){
				for(int j=0;j<6;j++){
					if(i*j==8){
						break search;
					}
					System.out.printf("value of i= %d and j= %d %n",i,j);
				}
			}
	}

}
