import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // No of people
		int x = sc.nextInt(); // Book size
		int[] arr = new int[x+1];
		for(int i=0; i<n; i++) {
		    int from = sc.nextInt();
		    int to = sc.nextInt();
		    for(int j=from; j<=to; j++) {
		        arr[j]++;
		    }
		}
		int max = 0;
		for(int i=0; i<x+1; i++) {
		    if(arr[i] > max) {
		        max = arr[i];
		    }
		}
		for(int i=0; i<x+1; i++) {
		    if(arr[i] == max) {
		        System.out.print(i + " ");
		    }
		}
	}
}
