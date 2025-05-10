import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String[] num=str.split("[a-zA-z]");// Regular Expression
		ArrayList<Integer> n=new ArrayList<>();
		for(int i=0;i<num.length;i++){
		    if(!(num[i].equals(""))){
		        n.add(Integer.parseInt(num[i]));
		    }
		}
		String[] al=str.split("[0-9]");
		ArrayList<String> s=new ArrayList<>();
		for(int i=0;i<al.length;i++){
		    if(!(al[i].equals(""))){
		        s.add(al[i]);
		    }
		}
	//	System.out.println(s);
	for(int i=0;i<n.size();i++){ 
	        for(int k=0;k<n.get(i);k++){ 
	            for(int j=i;j<s.size();j++){
	        System.out.print(s.get(j)+" ");
	        }
	    }
	    System.out.println();
	}
		
		
	}
}
