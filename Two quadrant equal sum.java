import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int s1=0,s2=0,s3=0,s4=0;
		int y=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<y && j<y){
                    s1+=arr[i][j];
                }
                else if(i<y && j>=y){
                    s2+=arr[i][j];
                }
                else if(i>=y && j<y){
                    s3+=arr[i][j];
                } 
                else{
                    s4+=arr[i][j];
                }
            }
        }
        if(s1==s2 || s1==s3 || s1==s4 || s2==s3 || s2==s4 || s3==s4){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        //System.out.println(s1+" "+s2+" "+s3+" "+s4);
	}
}
