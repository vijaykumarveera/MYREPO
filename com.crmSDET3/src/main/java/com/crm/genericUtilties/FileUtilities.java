package com.crm.genericUtilties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author vijaykumar v
 *
 */
public class FileUtilities 
{
	/**
	 * its is used get common data from property file based on the key which you have specified as a arguments
	 * @return
	 * @throws IOException 
	 */

	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fileInputStream =  new FileInputStream(IPathConstants.filePath);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
	}
}
