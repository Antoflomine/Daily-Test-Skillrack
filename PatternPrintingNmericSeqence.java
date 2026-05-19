import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int j=0; j<c; j++) {
			int  k=j+1;
			for(int i=0; i<r; i++) {
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
}
