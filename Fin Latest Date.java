import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dateC = sc.nextInt();
		int[] date = new int[dateC];
		for(int i=0; i<dateC; i++) {
		    date[i] = sc.nextInt();
		}
		Arrays.sort(date);
		int monthC = sc.nextInt();
		sc.nextLine();
		String[] month = new String[monthC];
		for(int i=0; i<monthC; i++) {
		    month[i] = sc.next();
		}
		int yearC = sc.nextInt();
		int[] year = new int[yearC];
		for(int i=0; i<yearC; i++) {
		    year[i] = sc.nextInt();
		}
		Arrays.sort(year);
		int recentYear = year[yearC-1];
		String[] lMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int fd = 28;
		if((recentYear%4 == 0 && recentYear%100 != 0)|| recentYear%400 == 0) {
		        fd=29;
		    }

		int[] noOfDays = {31, fd, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int indexM = -1;
		String recentMonth = "";
		for(int i=0; i<monthC; i++) {
		    for(int j=0; j<12; j++) {
		        if(month[i].equals(lMonths[j])) {
		            if(j>indexM) {
		                indexM = j;
		                recentMonth = month[i];
		            }
		        }
		    }
		}
	
		int recentMonthDays = noOfDays[indexM];
		int recentDate=-1;
		for(int i=dateC-1;i>=0;i--){
		    if(date[i]<=recentMonthDays){
		        recentDate=date[i];
		        break;
		    }
		}

		System.out.printf("%02d-%s-%d",recentDate , recentMonth , recentYear);
	}
}
