import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		char[][] arr=new char[5][5];
		char h='a';
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		       
		        if(h==a){
		            h++;
		        }
		        arr[i][j]=h;
		        h++;
		        
		    }
		}
	    for(int i=0;i<5;i++){
	        for(int j=0;j<5;j++){
	            if(arr[i][j]==b){
	                if(j!=0){
	                arr[i][j-1]=(char)(arr[i][j-1]-32);
	                }
	                if(j<=3){
	                arr[i][j+1]=(char)(arr[i][j+1]-32);
	                }
	                if(i!=0){
	                arr[i-1][j]=(char)(arr[i-1][j]-32);
	                }
	                if(i<=3){
	                arr[i+1][j]=(char)(arr[i+1][j]-32);
	                }
	                if(i!=0 && j!=0){
	                arr[i-1][j-1]=(char)(arr[i-1][j-1]-32);
	                }
	                if(i!=0 && j<=3){
	                arr[i-1][j+1]=(char)(arr[i-1][j+1]-32);
	                }
	                if(i<=3 && j!=0){
	                arr[i+1][j-1]=(char)(arr[i+1][j-1]-32);
	                }
	                if(i<=3 && j<=3){
	                arr[i+1][j+1]=(char)(arr[i+1][j+1]-32);
	                }
	            }
	        }
	    }
		//System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<5;i++){
		    for(int j=0;j<5;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}
