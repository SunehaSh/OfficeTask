package taskPackage;

import java.util.ArrayList;

public class Task5 {

	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Ram");
		al.add("Shyam");
		al.add("Rahim");
		al.add("shiv");
		al.add("kavita");
		
		
		
		System.out.println(al);
		
		for(String ref:al)
		{
			System.out.println("emp name:"+ref);
		}
		
		System.out.println("After removing one emp-----------------------------------");
		al.remove(2);
		
		for(String ref:al)
		{
			System.out.println(ref);
		}
		
		al.set(3, "Ramesh");
		
		for(String ref:al)
		{
			System.out.println("emp name:"+ref);
		}
		
		
		
	}

}
