import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<n;i++){
		    if(arr[i]%10!=0){
		    res.add(arr[i]);
		    }
		}
		System.out.println(res);
	}
}
