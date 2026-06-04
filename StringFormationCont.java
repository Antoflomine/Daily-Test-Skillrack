import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String m=sc.nextLine();
	    HashMap<Character,Integer> h=new HashMap<>();
	    for(int i=0;i<m.length();i++){
	        int c=0;
	        for(int j=0;j<s.length();j++){
	            if (s.charAt(j) == m.charAt(i)) {
                    c++;
                }
	        }
	       h.put(m.charAt(i),c);
	    }
	    int min = Integer.MAX_VALUE;

for (int value : h.values()) {
    if (value < min) {
        min = value;
    }
}

System.out.println(min);
	    
	    System.out.println(h);
	}
}
