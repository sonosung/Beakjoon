package q3040;

/*내가 쓴 미완성 코드
//import java.util.Random;
*
*Random newhat = new Random();	
int[] ran = new int[7];
//for (int i = 0; i < hat.length; i++) {
	//System.out.print(ran[newhat.nextInt(7)]);

}*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hat = new int[9];
		
		for (int i = 0; i < hat.length; i++ ) {
			hat[i] = sc.nextInt();
		}
		
		
		//for (int i = 0; i < hat.length; i++) {
		//	System.out.print(hat[i] + " ");
		
		
		sc.close();
		
		int sum = 0;
		for (int i = 0; i <hat.length; i++) {
			sum += hat[i];
		}
		System.out.println("sum : " + sum);
		//합계에서 제외할 2개의 수를 선정
		
		int ai = -1, aj = -1; //i,j 값을 저장하기 위해 변수를 지정한 것일 뿐. -1은 아무 의미 없음.
		for (int i = 0; i < hat.length; i++) {
			for (int j = 0; j < hat.length; j++) {
				if (i != j)  { //동일한 수가 더해지는 것을 막기위해 세운 조건.
					System.out.println(i + " : " + j + " = " + (hat[i] + hat[j]));
					System.out.println("~> " + (sum - (hat[i] + hat[j])));
					
					if	((sum - (hat[i] + hat[j]) == 100)) {
						ai = i;
						aj = j;
						break;
					}
				}
			}
		}
		for(int k = 0; k < hat.length; k++) {
			if (k != ai && k != aj)
				System.out.println(hat[k]);
		}
	}
}


		
	
	



