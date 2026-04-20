import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		if(N%2==1) {
			System.out.println(arr[N / 2][N / 2]);

		} else {
			int mid = N / 2;

			System.out.println(arr[mid - 1][mid - 1] + " " + arr[mid - 1][mid]);
			System.out.println(arr[mid][mid - 1] + " " + arr[mid][mid]);
		}
	}
}
