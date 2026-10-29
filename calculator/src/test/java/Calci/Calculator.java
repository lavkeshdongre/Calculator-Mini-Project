package Calci;

import org.testng.annotations.Test;

import Calculator_Automate.Addition;
import Calculator_Automate.Division;
import Calculator_Automate.Multiplication;
import Calculator_Automate.Subtraction;

@Test
public class Calculator {
	public void main() throws InterruptedException {
	
		Addition add = new Addition();
		add.Add();
		System.out.println("Addition operation perform successfully");
		Thread.sleep(2000);
		
		Subtraction sub = new Subtraction();
		sub.Sub();
		
		System.out.println("Subtraction operation done ");
		Thread.sleep(2000);
	
		Multiplication m = new Multiplication();
		
		Division d = new Division();
		
		m.mul();
		System.out.println("Multiplication Operation  done ");
		Thread.sleep(2000);
		d.div();
		System.out.println("Division Operation will done");
		Thread.sleep(2000);
//		
		
		Trignomentricopration t = new Trignomentricopration();
		t.trigno();
		
	}
}


