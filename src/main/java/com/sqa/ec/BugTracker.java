/**
 * File Name: BugTracker.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 24, 2017
 */
package com.sqa.ec;

import java.util.*;

import com.sqa.ec.helpers.*;

/**
 * BugTracker //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class BugTracker
{

	private static String appName = "Bug Tracker";

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName(appName);
		trackBug();
		AppBasics.fareWellUser(name);
	}

	public static void trackBug()
	{
		int numBug = AppBasics.requestInt("How many bug(s) would you like to enter?");
		ArrayList<Bug> bugList = new ArrayList<Bug>();
		int id;
		String reporter;
		String bugName;
		char category;
		String os;
		String enterDate;
		String detail;
		double frequency;
		for (int i = 0; i < numBug; i++)
		{
			id = i + 1;
			reporter = AppBasics.requestString("Enter Your Name: ");
			bugName = AppBasics.requestString("Enter Bug Name: ");
			category = AppBasics.requestChar("Enter Bug Category: ");
			os = AppBasics.requestString("Enter Your Operating System: ");
			enterDate = AppBasics.requestString("Enter Today's Date: ");
			detail = AppBasics.requestString("Enter Bug Details: ");
			frequency = AppBasics.requestDouble("Enter Bug Frequency: ");
			bugList.add(i, (new Bug(id, reporter, bugName, category, os, enterDate, detail, frequency, true)));
			if (i != numBug - 1)
			{
				System.out.println("\nEnter The Next Bug\n");
			}
		}
		if (numBug == 0)
		{
			System.out.println("No bug was entered.\n");
		} else
		{
			System.out.println("\nHere's the list of bugs you've entered...\n");
		}
		for (Bug bug : bugList)
		{
			System.out.print(bug.getId() + ", " + bug.getReporter() + ", " + bug.getBugName() + ", " + bug.getCategory() + ", " + bug.getOS() + ", " + bug.getEnterDate() + ", "
					+ bug.getBugDetails() + ", " + bug.getFrequency() + ", ");
			if (bug.isActive == true)
			{
				System.out.println("Active");
			}
			if (bug.isActive == false)
			{
				System.out.println("Inactive");
			}
		}
	}
}
