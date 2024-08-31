// The program must accept N string values containing only alphabets as the input. The program must sort the string values based on the count of lower case alphabets. If two ore more string values have the same count of lower case alphabets, then the program must print those string values based on their order of occurrence as the output. Finally, the program must print the sorted string values as the output.
// Boundary Condition(s):
// 2 <= N <= 50
// 1 <= Length of each string <= 100
// Input Format:
// The first line contains N.
// The next N lines, each contains a string value.
// Output Format:
// The first N lines, each contains a string value based on the given conditions.
// Example Input/Output 1:
// Input:
// 3
// candY faNcY
// mObile
// Output: faNcY candY mObile
// Explanation:
// The count of lower case alphabets in candY is 4.
// The count of lower case alphabets in faNcY is 3.
// The count of lower case alphabets in mObile is 5.
// After sorting the string values based on the count of lower case alphabets,


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		}
		int[] brr=new int[n];
		int u=0;
		for(int i=0;i<n;i++){
		    int c=0;
		    for(int j=0;j<arr[i].length();j++){
		        if(arr[i].charAt(j)>='a' && arr[i].charAt(j)<='z'){
		            c++;
		        }
		    }
		    brr[u++]=c;
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-1;j++){
		        if(brr[j]>brr[j+1]){
		            int t=brr[j];
		            String y=arr[j];
		            brr[j]=brr[j+1];
		            arr[j]=arr[j+1];
		            brr[j+1]=t;
		            arr[j+1]=y;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}
		//System.out.print(Arrays.toString(arr));

	}
}
