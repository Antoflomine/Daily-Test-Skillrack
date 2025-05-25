// A magic candle will always glow, but if someone drops a drop of water on the candle it will not light up for the next X seconds and then it will start to light up again. The program must accept N sorted integers representing the time series in which the water drops on the candle and the value of X as the input. The program must print the total time that the candle is not in the glowing state as the output. If a drop of water dropped on the candle when it is not in the glowing state, then the candle will start to light up after X seconds (i.e., the candle will not consider the previous drop of water).
// Boundary Condition(s):
// 1 <= N <= 1000
// 1 <= Each integer value <= 10^g
// • 1 <= X <= 100
// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains X.
// Output Format:
// The first line contains the total time that the candle is not in the glowing state.
// Example Input/Output 1:
// Input:
// 4
// 1 6 10 11
// 2
// Output:
// 7
// Explanation:
// Here X = 2.
// At t = 0, the candle is glowing.
// At t = 1, the candle is NOT glowing because a drop of water drops on
// the candle.
// At t = 2, the candle is NOT glowing.
// At t = 3, the candle is glowing (2 seconds over).
// At t = 4, the candle is glowing.
// At t = 5, the candle is glowing.
// At t = 6, the candle is NOT glowing as a drop of water drops on the
// candle.
// At t = 7, the candle is NOT glowing
// • At t = 8, the candle is glowing (2 seconds over).
// At t = 9, the candle is glowing.
// At t = 10, the candle is NOT glowing because a drop of water drops on
// the candle.
// At t = 11, the candle is NOT glowing because a drop of water drops on
// the candle.
// At t = 12, the candle is NOT glowing.
// At t = 13, the candle is glowing (2 seconds over).
// At t = 14, the candle is glowing and so on.
// The total time that the candle is not in glowing state is 7. So 7 is printed as the output


import java.util.*;
public class Hello {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int x=sc.nextInt();
	    int tng=0;
	    int ne=0;
	   
	    for(int i=0;i<n;i++){
	         int d=arr[i];
	         if(d>=ne){
	             tng+=x;
	             ne=d+x;
	         }
	         else{
	             tng+=(d+x)-ne;
	             ne=(d+x);
	         }
	    }
	    System.out.print(tng);	    
	}
}
