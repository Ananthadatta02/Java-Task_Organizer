package collection_queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// User-defined Class 

public class DequeUtil<T> 
{
	public Deque<T> chooseDequeType()
	{
		Scanner s = new Scanner(System.in);
		Deque<T> dq = null;
		System.out.println("Press 1 For LinkedList");
		System.out.println("Press 2 For ArrayDeque");
		switch(s.nextInt())
		{
		case 1 : dq = new LinkedList<T>();
		break;
		case 2 : dq = new ArrayDeque<T>();
		break;
		default : System.out.println("Invalid Choice..");
		break;
		}
		
		return dq;
	}
}
