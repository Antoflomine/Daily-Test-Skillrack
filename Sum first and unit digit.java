import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
	//	System.out.print("0 ");
	sc.nextLine();
	for(int i=0;i<n;i++){
	    arr[i]=sc.next();
	}
	//System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            int sum1=0,sum2=0;
            
            for(int j=0;j<i;j++){
                if(arr[i].charAt(0)==arr[j].charAt(arr[j].length()-1)){
                    sum2+=Integer.parseInt(arr[j]);
                }
            }
            for(int j=i+1;j<n;j++){
             if(arr[i].charAt(arr[i].length()-1)==arr[j].charAt(arr[j].length()-1)){
               // int a=Integer.parseInt(arr[i]);
                int b=Integer.parseInt(arr[j]);
                sum1+=b;
               // System.out.println(b);
            }
         
            }
            System.out.println(sum2+" "+sum1);
            
        }
        
	}
}
