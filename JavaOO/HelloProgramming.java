import java.util.*;

public class HelloProgramming {

	// 1.���� �����ϱ�(���̵�, ��ȣ, �������, Ű �Է¹޾� ����ϱ�)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("���̵� �Է��ϼ���.");
		String id = input.next();

		System.out.println("��ȣ�� �Է��ϼ���.(8�ڸ����� ����)");
		int password = input.nextInt();

		System.out.println("Ű�� �Է��ϼ���.(cm)");
		int height = input.nextInt();

		System.out.println("������" + id + ",��ȣ��" + password + ",Ű��" + height + "cm�� �½��ϱ�?");

		// 2.�̱� ���α׷��� ������� �Ѵ�. ó���� ���ڸ� �Է¹޾� 1�������� �� ���� ������ ������ ���� 3�� ����ϵ���
		// ���α׷��ϼ���.
		System.out.println("������ �����ϼ���.(1���� ����)");
		int nb = input.nextInt();
		Random r = new Random();
		System.out.println("1����" + nb + "���̿� ������ ���� 3���� ����մϴ�.");
		int num1 = r.nextInt(nb) + 1;
		int num2 = r.nextInt(nb) + 1;
		int num3 = r.nextInt(nb) + 1;
		System.out.println("���� ���ڴ�" + num1 + "," + num2 + "," + num3 + "�Դϴ�.");
	}

}