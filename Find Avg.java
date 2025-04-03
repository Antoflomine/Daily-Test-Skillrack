import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i+=3) {
		    float sum = 0;
		    for(int j=i; j<i+3; j++) {
		        sum += arr[j];
		    }
		    System.out.printf("%.2f ", sum/3.0);
		}
	}
}
