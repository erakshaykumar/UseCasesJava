package javaproject;

public class empWageBuilderUC1 {

	public static void main(String[] args) {
			int full = 1;	
			double empCheck = Math.floor(Math.random() * 10) % 2;
				if (empCheck == full)
					System.out.println("Employee is Present");
				else
					System.out.println("Employee is Absent");

			}

		}

