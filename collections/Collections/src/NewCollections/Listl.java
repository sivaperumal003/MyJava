package NewCollections;

import java.util.*;

public class Listl {

	public static void main(String[] args) {
    List<Integer> firstFivePrime =new ArrayList<> ();
    firstFivePrime.add(122);
    
    List<Integer> tenPrimeNumbers=new  ArrayList<>(firstFivePrime);
    
    List<Integer> lastFivePrime=new ArrayList<>();
    lastFivePrime.add(11);
    lastFivePrime.add(13);
    lastFivePrime.add(17);
    lastFivePrime.add(19);
    lastFivePrime.add(23);
    
    tenPrimeNumbers.addAll(lastFivePrime);
    	
    

    
   System.out.println(firstFivePrime);
   System.out.println(tenPrimeNumbers);
      
	}
	
	
	
	}


