import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		String[] brr=str.split("[{}]");
		for(int i=0;i<brr.length;i++){
		    if(brr[i].matches("[0-9]")){
		    int a=Integer.parseInt(brr[i]);
		        System.out.print(arr[a-1]);
		    }
		    else{
		        System.out.print(brr[i]);
		    }
		}
	//	System.out.println(Arrays.toString(brr));
		
		
	}
}
