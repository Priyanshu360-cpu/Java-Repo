package com.ibm.generics;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

class Point<T extends Number>{
	private T x;
	private T y;
	public Collection<String> getData(){
		List<String> result=new LinkedList<String>();
		result.add("hi");
		result.add("how are you?");
		return result;
	}
	public Map<Integer,String> defineMap(){
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(2, "hi");
		hashmap.put(3, "no");
		return hashmap;
	}
	Point(T x,T y){
		this.x=x;
		this.y=y;
	}
	public void setx(T x) {
		this.x=x;
	}
	public T getx() {
		return x;
	}
}
public class Application
{
	public static void main( String[] args )
	{
		Point<Integer> point = new Point<Integer>(2,3);
		System.out.println(point.getx());
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("hi");
		arrayList.add("how are you?");
		 
		Collection<String> arrayList1=point.getData();

		Iterator<String> iterator = arrayList.iterator();
		Map<Integer,String> hashmap3=point.defineMap();
		Set<Integer> keys=hashmap3.keySet();
		Iterator<Integer> keyIterator = keys.iterator();
		while(keyIterator.hasNext()) {
			Integer key = keyIterator.next();
			String value=hashmap3.get(key);
			System.out.println(key+"--->"+value);
		}
		Set<Entry<Integer,String>> keys2=hashmap3.entrySet();
		Iterator<Entry<Integer,String>> keyIterator2 = keys2.iterator();
		while(keyIterator2.hasNext()) {
			Entry<Integer,String> entry = keyIterator2.next();
			System.out.println(entry);
		}
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}