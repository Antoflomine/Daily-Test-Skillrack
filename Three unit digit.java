import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		}
//System.out.println(Arrays.toString(arr));
        for(int i=0;i<=n-3;i=i+3){
            String s="";
            s+=arr[i].charAt(arr[i].length()-1);
            s+=arr[i+1].charAt(arr[i+1].length()-1);
            s+=arr[i+2].charAt(arr[i+2].length()-1);
            //System.out.println(s);
            char[] brr=s.toCharArray();
            for(int k=0;k<brr.length;k++){
                for(int j=0;j<brr.length-1;j++){
                    if(brr[j]<brr[j+1]){
                        char t=brr[j];
                        brr[j]=brr[j+1];
                        brr[j+1]=t;
                    }
                }
            }
            String g="";
            for(int o=0;o<brr.length;o++){
                g+=brr[o];
            }
            int y=Integer.parseInt(g);
            if(y==0){
                System.out.print("-1 ");
            }
            else{
            System.out.print(g+" ");
            }
            //System.out.println(Arrays.toString(brr));
        }
	}
}
