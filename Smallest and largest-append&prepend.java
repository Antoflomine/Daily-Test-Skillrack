// The program must accept N integers as the input. For each integer X among the N integers, the program must find the smallest digit and the largest digit in X. Then the program must append(inserting at the end) the smallest digit to X and prepend(inserting at the beginning) the largest digit to X. Finally, the program must print the sum of the N modified integers as the output.
// Boundary Condition(s):
// 1<=N ＜=100
// 1 <= Each integer value <= 10^5
// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// Output Format:
// The first line contains the sum of the N modified integers.
// Example Input/Output 1:
// Input:
// 4
// 1234 405 12088 15
// Output:
// 8592422
// Explanation:
// Here N = 4.
// 1st integer 1234 -> 412341
// 2nd integer 405 -> 54050
// 3rd integer 12088 -> 8120880
// 4th integer 15 -> 5151
// The sum of the 4 modified values is 8592422.
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++){
		    arr[i]=sc.next();
		}
		long sum=0;
		for(int i=0;i<n;i++){
		    char s='A',l='0';
		    for(int j=0;j<arr[i].length();j++){
		        if(s>arr[i].charAt(j)){
		            s=arr[i].charAt(j);
		        }
		        if(l<arr[i].charAt(j)){
		            l=arr[i].charAt(j);
		        }
		    }
		    //System.out.println(s+" "+l);
		    String res=l+""+arr[i]+""+s;
		    long h=Long.parseLong(res);
		    sum+=h;
		    //System.out.println(res);
		}
		System.out.println(sum);

	}
}
