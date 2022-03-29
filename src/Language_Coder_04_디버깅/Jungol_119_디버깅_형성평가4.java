package Language_Coder_04_디버깅;

import java.util.Calendar;

public class Jungol_119_디버깅_형성평가4 {
	public static void main(String[] args) {
		// JDK 1.1부터 새롭게 제고되는 Calender 클래스로 값이 별할 수 있다. 윤년 고려x
		Calendar cal = Calendar.getInstance();

		// 실행일 : Wed Feb 02 13:28:15 KST 2022 (2022-02-02)
		// System.out.println(cal.getTime());
		
        int a = 0;
        a = cal.get (Calendar.YEAR )-1900; //---① 
        // MONTH 범위 : 0~11
        a += cal.get (Calendar.MONTH ); //---② 
        a += cal.get (Calendar.DATE ) ; 
        
        System.out.printf("%d %d %d ", 0, 122, 125); //---③ //① ② ③에서의 a값을 1, 2, 3자리에 각각 써 넣는다. 
	}
}
/*
디버깅 실행 : F11
Break Point : 코드 좌측 더블클릭
코드 1줄 실행 : F6
코드 내부 1줄 실행 : F5 / 빠져나오기 : F7
코드 실행 : F8
종료 : Ctrl + F2
*/