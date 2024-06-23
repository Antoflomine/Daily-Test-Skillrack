import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr=sc.nextLine().split(" ");
		for(int i=0;i<arr.length;i++){
		    int v=0,c=0;
		    for(int j=0;j<arr[i].length();j++){
		        char t=arr[i].charAt(j);
		        if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u' || t=='A' || t=='E' || t=='O' || t=='I' || t=='U'){
		            v++;
		        }
		        else{
		            c++;
		        }
		    }
		    if(c==v){
		        StringBuilder sb=new StringBuilder(arr[i]).reverse();
		        System.out.print(sb.toString()+" ");
		    }
		    else{
		        System.out.print(arr[i]+" ");
		    }
		}
//System.out.println(Arrays.toString(arr));

	}
}
