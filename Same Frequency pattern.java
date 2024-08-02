import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int[] arr=new int[256];
		int[] brr=new int[256];
		for(int i=0;i<s1.length();i++){
		    arr[(int)s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++){
		    brr[(int)s2.charAt(i)]++;
		}
		Arrays.sort(arr);
		Arrays.sort(brr);
		int c=0;
		for(int i=0;i<256;i++){
		    if(arr[i]!=0 && brr[i]!=0 && arr[i]==brr[i]){
		        c+=arr[i];
		    }
		}
		if(c==s1.length()){
		    System.out.println("yes");
		}
		else{
		    System.out.println("no");
		}
		

	}
}
