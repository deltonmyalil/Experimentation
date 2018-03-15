package com.ObjectArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Student> studentArrayList = new ArrayList<Student>();

	public static void main(String[] args) {

		while (true) {
			System.out.print("Want to enter the student details?");
			String response = scanner.nextLine();
			if (response.equals("n")) {
				break;
			} else {
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				System.out.print("Enter roll number: ");
				int number = scanner.nextInt();
				scanner.nextLine();
				Student tempStudent = new Student(name, number);
				studentArrayList.add(tempStudent);
			}
		}

		System.out.println("Sorting with respect to Roll number...");
		sortRollNumber();

		System.out.println("Printing Student List in sorted order...");
		for (int i = 0; i < studentArrayList.size(); i++) {
			System.out.println("Name: " + studentArrayList.get(i).getName() + "; Roll: " + studentArrayList.get(i).getRoll());
		}
	}

	public static void sortRollNumber() {
		int i,j;
		for (i = 0; i < studentArrayList.size(); i++) {
			for (j = 0; j < studentArrayList.size()-i-1; j++) {
				if(studentArrayList.get(j).getRoll()>studentArrayList.get(j+1).getRoll()) {
					Student tempStudentJ = studentArrayList.get(j);
					Student tempStudentJplus1 = studentArrayList.get(j+1);
					studentArrayList.set(j,tempStudentJplus1);
					studentArrayList.set(j+1,tempStudentJ);

//					studentArrayList.remove(j);
//					studentArrayList.add(j,studentArrayList.get(j+1));
//					studentArrayList.remove(j+1);
//					studentArrayList.add(j+1, tempStudent);
				}
			}
		}
	}
}
