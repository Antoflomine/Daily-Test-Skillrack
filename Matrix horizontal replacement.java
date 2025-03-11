// The program must accept a character matrix of size R"C and a string S as the input. The program must find the first occurring cell X which contains the first character of S in the matrix. Then the program must replace the characters from the cell X with the characters of the string S horizontally. If it reaches the last row of the matrix when replacing, then it will start replacing the characters from the first row of the matrix.
// Finally, the program must print the modified matrix as the output.
// Note: The first character of S always occurs in the given matrix.
// Boundary Condition(s):
// 2<＝R,C<=50
// 1 <= Length of S < = R*C
// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C characters separated by a space.
// The (R+2)h line contains S.
// Output Format:
// The first R lines, each contains C characters separated by a space.
// Example Input/Output 1:
// Input:
// 65


// ymwhy

// im vai

// plgxv

// hpovo

// oces g

// Isd bp

// vegetable



// Output:

// y mwhy

// im veg

// etabl

// epovo

// oces Is dbp
// Explanation:
// The first character of the given string vegetable is v.
// The first occurrence of the character v in the matrix is (2, 3).
// After replacing the characters from the cell (2, 3) with the characters of the string S, the matrix becomes y mwhy
// imve g
// e tabl epovo
// oces g
// Isd bp
// Example Input/Output 2:
// Input:
// 33
// esz
// zS f
// i wc
// SkillRack
// Output:
// Ra c kS k
// ill
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char[][] arr=new char[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.next().charAt(0);
		    }
		}
		sc.nextLine();
		String str=sc.nextLine();
	
       int x=0,y=0;
       outerLoop:
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		    if(arr[i][j]==str.charAt(0)){
		        x=i;
		        y=j;
		     break outerLoop;
		    }
		   
		    }
		}
	    //System.out.println(x+" "+y);
	  int s=0;
	  int row=x,col=y;
	  while(s<str.length()){
	      arr[row][col]=str.charAt(s++);
	      col++;
	      if(col==c){
	          col=0;
	          row=(row+1)%r;
	      }
	  }
	  for(int i=0;i<r;i++){
	      for(int j=0;j<c;j++){
	          System.out.print(arr[i][j]+" ");
	      }
	      System.out.println();
	  }
        //System.out.println(Arrays.deepToString(arr));

	}

	
}
