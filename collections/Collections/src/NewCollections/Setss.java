package NewCollections;

import java.util.*;

public class Setss {

	public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
        
        set.add(1);
        set.add(2);
        set.add(9);
        set.add(9);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.stream().forEach((se)->System.out.println(se));
        
        set.stream().forEach(se->System.out.println(se));
  	}

}
