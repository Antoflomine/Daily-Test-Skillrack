import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Set<String> set=new HashSet<>();
		
		for(int i=1;i<=str.length();i++){
		    String f=str.substring(i,str.length());
		    f+=str.substring(0,i);
		    set.add(f);
		   // System.out.println(f);
		}
		System.out.println(set.size());

	}
}
