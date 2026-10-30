package Calculator_Automate;

import org.testng.annotations.Test;


public class calci {
	@Test
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
	
		
		TrignomentricDegree t = new TrignomentricDegree();
		t.trigno();
		System.out.println("Degree mode done");
	
		TringnomentricRadian r = new TringnomentricRadian();
		r.trignoradian();
		System.out.println("Radian mode done");
		
		Financialcalculator f = new Financialcalculator();
		f.financial();
		System.out.println("test functionality test");
		
		Fitnesshealth_calculator f1 = new Fitnesshealth_calculator();
		f1.fitness();
		System.out.println("All browser will open suceessfully");
		
		Math mat = new Math();
		mat.mathematics();
		System.out.println("All math calculator operation done ");
		
		Othe_cal oc = new Othe_cal();
		oc.others_calculator();
		
		System.out.println("All operation done other calculator");
		
		
	     Footer Drop =  new Footer();
	    Drop.Droplink();
	    System.out.println("Footer link open successsfully");
	
		
		
		
	}
}


