import java.util.*;
import java.util.TreeMap;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		}
	    ArrayList<String> str=new ArrayList<>();
	    ArrayList<Integer> in=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int c=0;
		    for(int j=0;j<arr[i].length();j++){
		        if(arr[i].charAt(j)>='A' && arr[i].charAt(j)<='Z'){
		            c++;
		        }
		    }
		   
		   str.add(arr[i]);
		   in.add(c);
		    
		}
	//System.out.println(str+" "+in);	
	for(int i=0;i<in.size();i++){
	    for(int j=0;j<in.size()-1;j++){
	        if(in.get(j)<in.get(j+1)){
	            int t=in.get(j);
	            String tp=str.get(j);
	            in.set(j,in.get(j+1));
	            str.set(j,str.get(j+1));
	            in.set(j+1,t);
	            str.set(j+1,tp);
	        }
	    }
	}
	//System.out.println(str+" "+in);
	for(int i=0;i<str.size();i++){
	    System.out.println(str.get(i));
	}

	}
}
