package com.collectionandillustrate;

import java.util.ArrayList;

public class FruitBasket {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
        al.add("apple");
		al.add("orange");
		al.add("banana");
		al.add("kiwi");
		
		
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("----------------");
		ArrayList<String> al1=new ArrayList<String>();
        al1.add("pomagranate");
        al1.add("papaya");
        al1.addAll(al);
        for(String s:al1)
        {
        	System.out.println(s);
        }
        System.out.println("--------------");
        al1.removeAll(al);
        for(String s:al)
        {
        	System.out.println(s);
        }
        al1.clear();
        for(String s:al1)
        {
        
        System.out.println(s);
        
	}
  }
}

	