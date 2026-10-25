package Calci;

import org.testng.annotations.Test;

@Test
public class calci {
	public static void main(String[]args) throws InterruptedException {
		
		
	
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
	
		
		TrignomentricDegree t = new TrignomentricDegree();
		t.trigno();
		System.out.println("Degree mode done");
	
		TringnomentricRadian r = new TringnomentricRadian();
		r.trignoradian();
		System.out.println("Radian mode done");
		
	}
}


