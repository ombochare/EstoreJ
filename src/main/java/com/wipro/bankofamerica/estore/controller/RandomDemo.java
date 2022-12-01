package com.wipro.bankofamerica.estore.controller;

import java.util.Random;



public class RandomDemo {
public static void main(String[] args)  {

	Random rnd = new Random();
	int number = rnd.nextInt(3);
	System.out.println(number);
}
}