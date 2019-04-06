package moduleFour;

import java.util.Scanner;

public class gpaSort {
	private static int[] gpaScores = new int[50];
	
	private static int size = 10;
	
	static Scanner input = new Scanner(System.in);
	
	public void score() {
		System.out.println("Enter students GPA: ");
		for(int i = 0; i < size; i++) {
			int gpa = input.nextInt();
			gpaScores[i] = gpa;
		}
	}
	
	public void printArray() {
		System.out.println("----------");
		for(int i = 0; i < size; i++) {
			System.out.println("| " + i + " |");
			System.out.println("| " + gpaScores[i] + " |");
			System.out.println("----------");
		}
	}
	
	public void swapValues(int indexOne, int indexTwo) {
		int temp = gpaScores[indexOne];
		gpaScores[indexOne] = gpaScores[indexTwo];
		gpaScores[indexTwo] = temp;
	}
	
	public void SelectionSort() {
		for(int i = 0; i < size; i++) {
			int minimum = i;
			
			for(int j = i; j < size; j++) {
				if(gpaScores[minimum] > gpaScores[j]) {
					minimum = j;
				}
			}
			swapValues(i, minimum);
		}
	}
	
	public static void main(String[] args) {
		gpaSort studentScores = new gpaSort();
		studentScores.score();
		studentScores.SelectionSort();
		studentScores.printArray();

	}
}
