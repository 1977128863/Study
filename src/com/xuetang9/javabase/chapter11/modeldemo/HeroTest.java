package com.xuetang9.javabase.chapter11.modeldemo;

public class HeroTest {

	public static void main(String[] args) {
		//????սʿ֮???Ķ?ս
		Hero hero1 = new Warrior(1, "????", 0, 0);
		Hero hero2 = new Warrior(2, "????", 50, 50);
//		hero1.PK(hero2);
//		System.out.println();
//		hero2.PK(hero1);
		
		Hero hero3 = new Magical(3, "?ܲ?", 500, 250, 250);
		hero3.PK(hero1);		//?ܲٹ???????
		System.out.println("\n");
		hero1.PK(hero3);		//???׹????ܲ?
		
	}

}
