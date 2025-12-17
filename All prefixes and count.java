import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		    
		}
		Map<String,Integer> map=new TreeMap<>();
		for(int i=0;i<n;i++){
		    String s=arr[i].substring(0,3);
		    if(map.containsKey(s)){
		        map.put(s,map.get(s)+1);
		    }
		    else{
		        map.put(s,1);
		    }
		}
		for(Map.Entry<String,Integer> e:map.entrySet()){
		    System.out.println(e.getKey()+" "+e.getValue());
		}
        
	}
}
