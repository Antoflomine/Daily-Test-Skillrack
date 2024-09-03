import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] s=sc.nextLine().split(" ");
	//	System.out.println(Arrays.toString(arr));
	    int[] arr=new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int[] brr=arr.clone();
        Arrays.sort(brr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<brr.length;j++){
                if(arr[i]==brr[j] && j==brr.length-1){
                    System.out.print("-1 ");
                }
                else if(arr[i]==brr[j]){
                    System.out.print(brr[j+1]+" ");
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(brr));
        
	}
}
