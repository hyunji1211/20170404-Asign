import java.util.*;

public class HelloProgramming {

	// 1.계정 생성하기(아이디, 암호, 생년월일, 키 입력받아 출력하기)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("아이디를 입력하세요.");
		String id = input.next();

		System.out.println("암호를 입력하세요.(8자리이하 숫자)");
		int password = input.nextInt();

		System.out.println("키를 입력하세요.(cm)");
		int height = input.nextInt();

		System.out.println("계정은" + id + ",암호는" + password + ",키는" + height + "cm가 맞습니까?");

		// 2.뽑기 프로그램을 만들려고 한다. 처음에 숫자를 입력받아 1에서부터 그 숫자 사이의 랜덤한 값을 3개 출력하도록
		// 프로그램하세요.
		System.out.println("범위를 지정하세요.(1부터 시작)");
		int nb = input.nextInt();
		Random r = new Random();
		System.out.println("1부터" + nb + "사이에 랜덤한 숫자 3개를 출력합니다.");
		int num1 = r.nextInt(nb) + 1;
		int num2 = r.nextInt(nb) + 1;
		int num3 = r.nextInt(nb) + 1;
		System.out.println("뽑힌 숫자는" + num1 + "," + num2 + "," + num3 + "입니다.");
	}

}