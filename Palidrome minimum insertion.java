import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] arr=new int[256];
		for(int i=0;i<str.length();i++){
		    arr[(int)str.charAt(i)]++;
		}
		int c=0,f=0;
		for(int i=0;i<256;i++){
		    if(arr[i]%2!=0){
		        c++;
		        f=1;
		    }
		}
		if(f==0){
		    System.out.print("0");
		}
		else{
		System.out.println(c-1);
		}
	//	System.out.println(Arrays.toString(arr));

	}
}
