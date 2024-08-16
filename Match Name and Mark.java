import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		String[] mark=sc.nextLine().split(" ");
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<mark.length;j++){
		    if(arr[i].charAt(0)==mark[j].charAt(0) && arr[i].charAt(arr[i].length()-1)==mark[j].charAt(mark[j].length()-1) ){
		        System.out.print(arr[i]+" ");
		        for(int k=0;k<mark[j].length();k++){
		            if(mark[j].charAt(k)>='0' && mark[j].charAt(k)<='9'){
		                System.out.print(mark[j].charAt(k));
		            }
		        }
		        System.out.println();
		    }
		    }
		}
		//System.out.println(Arrays.toString(mark));
	}
}
