package oops.concurrent;

import java.util.concurrent.ConcurrentHashMap;

import java.util.Currency;

public class ConcurrentHashMapExample {

	public ConcurrentHashMapExample() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ConcurrentHashMap<String,Integer> hash = new ConcurrentHashMap<>();
		hash.put("key", 12);
		
	}

}
