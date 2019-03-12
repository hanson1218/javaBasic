package com.datastructure;

public interface MyMap<K,V > {
	public V put(K k,V v);
	public V get(K k,V v);
	
	interface Entry<K,V>{
		public K getKey();
		public V getValue();
	}
}
