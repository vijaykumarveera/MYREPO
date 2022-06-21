 package com.crm.genericUtilties;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author vijaykumar v
 *
 */
public class JavaUtility 
{
	/**
	 * 
	 * @return
	 */
	public int getRandomNumber()
	{
		Random random = new Random();
		int randNum = random.nextInt(1000);
		return randNum;
	}
	/**
	 * its used to get systemDateAndTime in IST Format
	 * @return
	 */
	public String getSystemDateAndTimeInISTformat() 
	{
		Date date = new Date();
		return date.toString();
	}
	/**
	 * its used to get system Data And Time in required format
	 * @return
	 */
	public String getSystemDateAndTimeInformat()
	{
		Date date = new Date();	
		String value = date.toString();

		String yyyy = value.split(" ")[5];
		String DD = value.split(" ")[2];
		int mm = date.getMonth()+1;

		String finalformat = yyyy+" "+DD+" "+mm;
		return finalformat;
	}
}