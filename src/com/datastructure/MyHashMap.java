package com.datastructure;

public class MyHashMap<K,V> implements MyMap<K, V>{

	private static final int DEFAULT_INITTAL_CAPACITY=1<<4;
	private static final float DEFAULT_LOAD_FACTOR=0.75f;
	
	private int defaultIntSize;
	private float defaultLoadFactor;
	
	private Entry<K, V>[] table=null;
	
	
	public MyHashMap() {
		this(DEFAULT_INITTAL_CAPACITY,DEFAULT_LOAD_FACTOR);
	}
	
	public MyHashMap(int defaultCapacity,float defaultLoadFactor){
		if (defaultCapacity<0) {
			throw new IllegalArgumentException("illagal defaultCapacity "+ defaultCapacity);
		}
		
		if (defaultLoadFactor<0) {
			throw new IllegalArgumentException("illagal defaultLoadFactor "+ defaultLoadFactor);
		}
		
		this.defaultIntSize=defaultCapacity;
		this.defaultLoadFactor=defaultLoadFactor;
		table=new Entry[this.defaultIntSize];
	}
	
	
	
	@Override
	public V put(K k, V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(K k, V v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	class Entry<K,V> implements MyMap.Entry<K, V>{

		private K key;
		private V value;
		private Entry<K,V> next;
		
		public Entry() {
			// TODO Auto-generated constructor stub
		}
		
		public Entry(K k, V v,Entry<K,V> next){
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
