package co.grandcircus;

import java.util.ArrayList;

public class Task {

	public Task() {

	}

	private ArrayList<Boolean> complete;

	public ArrayList<Boolean> getComplete() {
		return complete;
	}

	public void setComplete(ArrayList<Boolean> complete) {
		this.complete = complete;
	}

	private ArrayList<String> date;

	public ArrayList<String> getDate() {
		return date;
	}

	public void setDate(ArrayList<String> date) {
		this.date = date;
	}

	private ArrayList<String> names;

	public ArrayList<String> getNames() {
		return names;
	}

	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	private ArrayList<String> tasks;

//	method for the list of tasks

	public ArrayList<String> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<String> tasks) {
		this.tasks = tasks;
	}

//	method for names
	public void namesAdd(String s) {
		names.add(s);

	}

//	method for task description 
	public void tasksAdd(String s) {
		tasks.add(s);
	}

//	method for date
	public void dateAdd(String s) {
		date.add(s);

//	method to delete tasks

	}

	public void comlpeteAdd(Boolean done) {
		complete.add(done);

	}

	public static void removeAll(int w, ArrayList<String> a, ArrayList<String> b, ArrayList<String> c,
			ArrayList<Boolean> d) {
		int x = w - 1;
		a.remove(x);
		b.remove(x);
		c.remove(x);
		d.remove(x);
	}

}
