import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=sc.nextInt();
	    sc.nextLine();
	    String s=sc.nextLine();
	    char[][] arr=new char[r][c];
	    String[] brr=new String[r];
	    for(int i=0;i<r;i++){
	        String h="";
	        for(int j=0;j<c;j++){
	            arr[i][j]=sc.next().charAt(0);
	            h+=arr[i][j];
	        }
	        brr[i]=h;
	    }
	    int co=0;
	    for(int i=0;i<r;i++){
	        if(brr[i].contains(s)){
	            co++;
	        }
	    }
	    System.out.println(Arrays.toString(brr));
		System.out.println(co);
	}
}
