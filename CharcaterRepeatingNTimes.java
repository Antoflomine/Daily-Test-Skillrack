import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=sc.nextInt();
	    LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
	    for(int i=0;i<str.length();i++){
	        if(hm.containsKey(str.charAt(i))){
	            	hm.put(str.charAt(i),hm.get(str.charAt(i))+1);

	        }else{
	            hm.put(str.charAt(i),1);
	        }
	    }
	    for(Map.Entry<Character, Integer> i:hm.entrySet()){
	        if(i.getValue()==n){
	            System.out.print(i.getKey());
	        }
	    }
		System.out.println(hm);
	}
}
