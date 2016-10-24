package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		NissanTiida nt = new NissanTiida();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int loopCount = input.nextInt();
		int i;
		for(i=0 ; i<loopCount ; i++)
		{
			nt.tiida();
		}

	}

}
