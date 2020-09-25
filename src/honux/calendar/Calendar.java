package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private final int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getMaxDaysOfMonth(int month) {
		return date[month-1];
	}

	public static void main(String[] args) {
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		System.out.println("1부터 12까지의 숫자 중 하나를 입력하시오 : ");
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = scanner.nextInt();
		scanner.close();
		
		
		System.out.printf("%d월은 %d일 까지 있습니다.", month, cal.getMaxDaysOfMonth(month));
		
	}
}
