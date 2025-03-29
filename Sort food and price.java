import java.util.*;

public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
sc.nextLine();
String[] menu = new String[num];
for(int i=0; i<num; i++) {
    menu[i] = sc.nextLine();
}
String[] food = new String[num];
int[] price = new int[num];
for(int i=0; i<num; i++) {
   String[] arr = menu[i].split(" ");
   food[i] = arr[0];
   price[i] = Integer.parseInt(arr[1]);
}
for(int i=0; i<num; i++) {
   for(int j=0; j<num-1; j++) {
       if(price[j] > price[j+1]) {
           int temp = price[j];
           String t = food[j];
           price[j] = price[j+1];
           food[j] = food[j+1];
           price[j+1] = temp;
           food[j+1] = t;
       }
   }
}
for(int i=0; i<num; i++) {
   System.out.println(food[i] + ":" + price[i]);
}
}
}
