package collection_queue_deque;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Deque;
import java.util.Scanner;

class Task
{
	private String taskName;
	private String taskTime;
	private String taskDate;
	private String taskDueDate;
	private String taskDueTime;
	
	//Constructor
	public Task(String taskName, String taskTime, String taskDate, String taskDueDate, String taskDueTime) 
	{
		this.taskName = taskName;
		this.taskTime = taskTime;
		this.taskDate = taskDate;
		this.taskDueDate = taskDueDate;
		this.taskDueTime = taskDueTime;
	}
	
	@Override
	public String toString() 
	{
		String taskInfo = "Task \n" + taskName + " - " + taskTime + " - " + taskDate +"\n" +
						 	"Due Date - " + taskDueDate + " - " + taskDueTime + "\n" +
						 	  "Report Submission - Pending";
		return taskInfo;
	}
}
public class TaskManager_UsingDeque 
{
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Deque<String> dq = new DequeUtil<String>().chooseDequeType();
		
		System.out.println("Type 'LIFO' for Last In First Out");
		System.out.println("Type 'FIFO' for First In First Out");
		String choice = s.next();
		
		while(true)
		{	
			System.out.println("\nPress 1 To Add the Task..");
			System.out.println("Press 2 To Remove the Task..");
			System.out.println("Press 3 To Display all the Tasks..");
			
			switch(s.nextInt())
			{
			case 1 : s.nextLine();
					 System.out.println("Enter the Following details..");
			  		 System.out.print("Enter Task Name : ");
			  		 String taskName = s.nextLine();
			  		 System.out.println("Enter Due Date Below");
			  		 System.out.print("Enter Date : ");
			  		 int dueDate = s.nextInt();
			  		 System.out.print("Enter Month : ");
			  		 int dueMon = s.nextInt();
			  		 System.out.print("Enter Year : ");
			  		 int dueYear = s.nextInt();
			  		 String validateDate = null;
			  		 if(dueDate>=1 && dueDate<=31)
			  		 {
			  			if(dueDate<10)
			  				validateDate = "0" + dueDate;
				  		 else
				  			validateDate = dueDate + "";
			  		 }
			  		 
			  		 String validateMon = null;
			  		 if(dueMon>=1 && dueMon<=12)
			  		 {
			  			if(dueMon<10)
			  				validateMon = "0" + dueMon;
				  		 else
				  			validateMon = dueMon + "";
			  		 }
			  		 
			  		 String validateDueDate = validateDate +"-" + validateMon +"-" + dueYear;
			  		 System.out.println("Enter Due Time Below ");
			  		 System.out.print("Enter Due Hour :- ");
			  		 int dueHour = s.nextInt();
			  		 System.out.print("Enter Due Minutes :- ");
			  		 int dueMinute = s.nextInt();
			  		 String hour = null;
			  		 if(dueHour>=0 && dueHour<=12)
			  		 {
			  			if(dueHour<10)
				  			hour = "0" + dueHour;
				  		 else
				  			 hour = dueHour + "";
			  		 }
			  		 String minute = null;
			  		 if(dueMinute>=0 && dueMinute<=59)
			  		 {
			  			if(dueMinute<10)
			  				minute = "0" + dueMinute;
			  			else
			  				minute = dueMinute + "";
			  		 }
			  		 String dueTime = hour + ":" + minute;
			  		 LocalTime time = LocalTime.now();
			  		 
			  		 int currentHour = time.getHour();
			  		 String currHour = null;
			  		 if(currentHour<10)
			  			 currHour = "0" + currentHour;
			  		 else
			  			currHour = currentHour + "";
			  		 
			  		 int currentMin = time.getMinute();
			  		 String currMin = null;
			  		 if(currentMin<10)
			  			currMin = "0" + currentMin;
			  		 else
			  			currMin = currentMin + "";
			  		 
					 String taskTime = currHour +":" + currMin;
					 LocalDate date = LocalDate.now();
					 String taskDate = date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
			  		 String taskDetails = taskName + " " + taskTime + " " + taskDate + " Due-->" + validateDueDate + " " +dueTime;
			  		 
			  		 if(choice.equalsIgnoreCase("FIFO"))
			  			 dq.addFirst(taskDetails);
			  		 else if(choice.equalsIgnoreCase("LIFO"))
			  			 dq.addLast(taskDetails);
			  		 System.out.println("...Your Task is Added Succesfully...");
			break;
			case 2 : 
//					 System.out.println("Enter the Task Name to Remove..");
//					 String removeTask = s.next();
					 if(choice.equalsIgnoreCase("FIFO"))
						  dq.removeLast();
					 else if(choice.equalsIgnoreCase("LIFO"))
						  dq.removeLast();
					 System.out.println("...Your Task is Removed Succesfully...");
			break;
			case 3 : System.out.println("Displaying All the Tasks Present..");
//					 System.out.println("Task Name " + "Time " + "_Date_" + "_Due-Date_"+"Due-Time");
					 System.out.println(dq);
			break;
			default : System.out.println("Invalid Choice..");
			break;
			}
			
			System.out.println("Do you want to Continue ?? y/n");
			char ch = s.next().charAt(0);
			if(ch=='n' || ch=='N')
				break;
		}
		
	}
}
