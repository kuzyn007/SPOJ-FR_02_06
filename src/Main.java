/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/FR_02_06/
 */

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Vector<String> niedowaga = new Vector<String>();
        Vector<String> prawidlowa = new Vector<String>();
        Vector<String> nadwaga = new Vector<String>();
        
        int t = in.nextInt();
        in.nextLine();
        for(int i=0; i<t; i++)
        {
	        String imie = in.next();
	        double masa = in.nextDouble();
	        double wzrost = in.nextDouble()/100;
	        
	        double BMI = masa / Math.pow(wzrost, 2);

	        if(BMI<18.5)
	        {
	        	niedowaga.add(imie);
	        }
	        else if(18.5<BMI && BMI<25.0)
	        {
	        	prawidlowa.add(imie);
	        }
	        else if(25.0<=BMI)
	        {
	        	nadwaga.add(imie);
	        }
        }
        
        System.out.println("niedowaga");
        for ( String item : niedowaga)
        {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("wartosc prawidlowa");
        for ( String item : prawidlowa)
        {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("nadwaga");
        for ( String item : nadwaga)
        {
            System.out.println(item);
        }
        
        in.close();
	}

}

