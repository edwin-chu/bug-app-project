/**
 * File Name: Bug.java<br>
 * Chu, Edwin<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 24, 2017
 */
package com.sqa.ec;

/**
 * Bug //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chu, Edwin
 * @version 1.0.0
 * @since 1.0
 */
public class Bug
{

	public String reporterName, bugName, operatingSystem, bugEnterDate, bugDetails;

	public char bugCategory;

	private int bugId;

	private double frequency;

	boolean isActive;

	public Bug()
	{
		this.bugId = 0;
		this.reporterName = "";
		this.bugName = "";
		this.bugCategory = 'z';
		this.operatingSystem = "";
		this.bugEnterDate = "";
		this.bugDetails = "";
		this.frequency = 0.0;
		this.isActive = true;
	}

	public Bug(int id, String name, String bugTitle, char category, String os, String dateEnter, String details, double feq, boolean status)
	{
		this.bugId = id;
		this.reporterName = name;
		this.bugName = bugTitle;
		this.bugCategory = category;
		this.operatingSystem = os;
		this.bugEnterDate = dateEnter;
		this.bugDetails = details;
		this.frequency = feq;
		this.isActive = true;
	}

	public String getBugDetails()
	{
		return this.bugDetails;
	}

	public String getBugName()
	{
		return this.bugName;
	}

	public char getCategory()
	{
		return this.bugCategory;
	}

	public String getEnterDate()
	{
		return this.bugEnterDate;
	}

	public double getFrequency()
	{
		return this.frequency;
	}

	public int getId()
	{
		return this.bugId;
	}

	public boolean getIsActive()
	{
		return this.isActive;
	}

	public String getOS()
	{
		return this.operatingSystem;
	}

	public String getReporter()
	{
		return this.reporterName;
	}
}
