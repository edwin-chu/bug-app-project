/**
 * File Name: BugSystem.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 24, 2017
 */
package com.sqa.ec;

import com.sqa.ec.helpers.*;

/**
 * BugSystem //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class BugSystem
{

	private static String appName = "Bug System";

	private static int[] bugIds;

	private static String[] reporterNames;

	private static String[] bugNames;

	private static char[] bugCategories;

	private static String[] operatingSystem;

	private static String[] date;

	private static String[] bugDetails;

	private static double[] frequencies;

	private static boolean[] activeness;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = AppBasics.greetUserAndGetName(appName);
		initBugs();
		createBugs();
		displayBugs();
		AppBasics.fareWellUser(name);
	}

	private static void createBugs()
	{
		for (int i = 0; i < bugIds.length; i++)
		{
			bugIds[i] = i + 1;
			reporterNames[i] = AppBasics.requestString("Who is reporting this bug?");
			bugNames[i] = AppBasics.requestString("Can you give me a name for this bug?");
			bugCategories[i] = AppBasics.requestChar("What is the category?");
			operatingSystem[i] = AppBasics.requestString("What operating system did this occur on?");
			date[i] = AppBasics.requestString("When did this bug first appear?");
			bugDetails[i] = AppBasics.requestString("Can you describe this bug details further?");
			frequencies[i] = AppBasics.requestDouble("How often in a day does this occur?");
			activeness[i] = AppBasics.requestBoolean("Is this bug active?");
		}
	}

	private static void displayBugs()
	{
		for (int i = 0; i < bugIds.length; i++)
		{
			System.out.println("Bug ID# " + bugIds[i]);
			System.out.println("\tReporter Name: " + reporterNames[i].toUpperCase());
			System.out.println("\tBug Name: " + bugNames[i]);
			System.out.println("\tCategory: " + bugCategories[i]);
			System.out.println("\tOS: " + operatingSystem[i]);
			System.out.println("\tDate: " + date[i]);
			System.out.println("\tDetails: " + bugDetails[i]);
			System.out.println("\tBug Frequency: " + frequencies[i]);
			System.out.println("\tBug Status: " + activeness[i]);
		}
	}

	private static void initBugs()
	{
		int bugCount = AppBasics.requestIntWithinRange("How many bugs will you like to enter into the system?", 1, 10, "You may enter 1 - 10 bugs at a time.");
		bugIds = new int[bugCount];
		reporterNames = new String[bugCount];
		bugNames = new String[bugCount];
		bugCategories = new char[bugCount];
		operatingSystem = new String[bugCount];
		date = new String[bugCount];
		bugDetails = new String[bugCount];
		frequencies = new double[bugCount];
		activeness = new boolean[bugCount];
	}
}
