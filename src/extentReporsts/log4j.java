package extentReporsts;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class log4j 
{
	@Test
	public void demoLog4j()
	{
		Logger log = Logger.getLogger("demo");
		log.warn("waring msg");
		log.error("error msg");
		log.info("infomation msg");
		log.fatal("fatal msg");
		log.debug("debug");
		
		Reporter.log("log4j msg",true);
	}

}
