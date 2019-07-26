package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum;
		Task t = new Task();
		boolean cont2 = true;
		boolean cont = true;
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> tasks = new ArrayList<>();
		ArrayList<String> dates = new ArrayList<>();
		ArrayList<Boolean> completes = new ArrayList<>();
// welcome
		System.out.println("Welcome to the Task Manager!");
		do {
//		list of things to choose
			System.out.println("1. List tasks");
			System.out.println("2. Add task");
			System.out.println("3. Delete task");
			System.out.println("4. Mark tasks complete");
			System.out.println("5. Quit");
			// scanner and prompt
			System.out.println("What would you like to do?");
			userNum = scan.nextInt();
			scan.nextLine();
			if (userNum == 1) {
				// call method for list

//				System.out.println((x)+". Team Member: "+names.get(i)+" Tasks: " + tasks.get(i)+ " Due date: "+ dates.get(i));
				System.out
						.println("Team Member" + "\t\t\t\t" + "Tasks" + "\t\t\t\t" + "Due Date" + "\t\t\t\t" + "Done?");
				System.out.println("");
				for (int i = 0; i < names.size(); i++) {
					int x = i + 1;
					System.out.println(x + ". " + names.get(i) + "\t\t\t\t" + tasks.get(i) + "\t\t\t\t" + dates.get(i)
							+ "\t\t\t\t" + completes.get(i));
				}
				System.out.println("");
				System.out.println("Here are your options");
			} else if (userNum == 2) {
				// call method for adding task
				System.out.println("ADD TASK");
				System.out.println("Team Member Name: ");
				String n = scan.nextLine();
				t.setNames(names);
				t.namesAdd(n);
				System.out.println("Task Description: ");
				String d = scan.nextLine();
				t.setTasks(tasks);
				t.tasksAdd(d);
				System.out.println("Due Date: ");
				String du = scan.nextLine();
				t.setTasks(dates);
				t.tasksAdd(du);

				System.out.println("Done?");
				do {
					String done = scan.nextLine();
					if (done.equalsIgnoreCase("yes")) {
						t.setComplete(completes);
						t.comlpeteAdd(true);
						cont2 = false;
					} else if (done.equalsIgnoreCase("no")) {
						t.setComplete(completes);
						t.comlpeteAdd(false);
						cont2 = false;

					} else {
						System.out.println("Input not accepted please print (Yes/no)");

					}
				} while (cont2);
			} else if (userNum == 3) {
				// call method for delete task
				System.out.println("Which task number would you like to delete?");
				int x;
				x = scan.nextInt();
				System.out.println("Are you sure you want to delete task number " + x + "? (yes/no)");
				String yaw = scan.next();
				if (yaw.equalsIgnoreCase("yes")) {

					if (x < names.size() + 1) {
						Task.removeAll(x, names, tasks, dates, completes);
					}

				} else {
					System.out.println("That task does not exist");
				}
			}
			// call method for completed task
			else if (userNum == 4) {
				System.out.println("Which task number has been completed?");
				int z;
				z = scan.nextInt();
				int j = z - 1;
				completes.set(j, true);

			} else {
				// exit loop for 5
				cont = false;
				System.out.println("Thank you for using the Task List!");
			}
		} while (cont);
		scan.close();
	}

}
