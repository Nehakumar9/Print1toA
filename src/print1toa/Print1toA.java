package print1toa;

import java.util.Scanner;

public class Print1toA {

	public static void print1ToA(int A) {
		if (A == 1){
            System.out.print(1 + " ");
            return;
        }
		print1ToA(A - 1);
        System.out.print(A + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		print1ToA(a);
	}

}
