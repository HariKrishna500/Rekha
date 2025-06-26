package package1;

import java.util.HashSet;

public class NonRepeating {

	public static void main(String[] args) {
	
		String str="harikrishna";
		
		HashSet<Character> unique=new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(unique.contains(ch)==true)
				
				unique.remove(ch);
			
			else
				
				unique.add(ch);
		}
		
		
		if(unique.size()==0) 
			
			System.out.println("There are no unique characters");
		
		for(Character ch:unique)
			
			System.out.print(" "+ch+ " ");
	

	}

}
