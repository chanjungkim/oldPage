package test03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("������ ���α׷��� �����մϴ�.");
		
		try {
			System.out.print("����1 �Է� >> ");
			n1 = sc.nextInt();
			System.out.print("����2 �Է� >> ");
			n2 = sc.nextInt();
			
			System.out.println("��: "+ (n1/n2));
			System.out.println("������: "+ (n1%n2));
		} catch (ArithmeticException e) {
			System.out.println("�ι�° ���ڴ� 0 �ȵ�!!");
		} catch (InputMismatchException e) {
			System.out.println("����.. ���ڸ� �Է��϶�� ����!!!");
		} catch (Exception e) {
			System.out.println("�������� �������� ���ܰ� �߻��߳׿�..");
			System.out.println("������ ����ó: ssungujin@naver.com");
		}
		
		/*
			catch (Exception e) {
				System.out.println("�������� �������� ���ܰ� �߻��߳׿�..");
				System.out.println("������ ����ó: ssungujin@naver.com");
			}catch (ArithmeticException e) {
				System.out.println("�ι�° ���ڴ� 0 �ȵ�!!");
			} catch (InputMismatchException e) {
				System.out.println("����.. ���ڸ� �Է��϶�� ����!!!");
			} catch (Exception e) {
				System.out.println("�������� �������� ���ܰ� �߻��߳׿�..");
				System.out.println("������ ����ó: ssungujin@naver.com");
			}
			
			�θ� ���� ������ �ؿ� ������ unreachable
		*/
		System.out.println("���α׷��� �����մϴ�.");
	}
}
