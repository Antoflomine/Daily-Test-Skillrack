import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int R=sc.nextInt();
		int N=sc.nextInt();
		int y=0;
		String m="";
		for(int i=0;i<R;i++){
		    if(s.charAt(i)=='0'){
		        m+=s.charAt(i);
		        m+='1';
		    }
		    else{
		        m+=s.charAt(i);
		        m+='0';
		    }
		}
		m+=s.substring(R,s.length());
		//System.out.println(m);
		System.out.println(m.charAt(N-1));

	}
}
