package propertyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropFile {

	public String readData(String key) throws IOException
	{
		FileInputStream fileInputStream = new FileInputStream("../AutomationTesting/commondata.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(key);
	}

}
