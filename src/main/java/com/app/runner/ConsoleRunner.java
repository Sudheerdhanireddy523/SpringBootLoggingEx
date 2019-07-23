package com.app.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;

public class ConsoleRunner implements CommandLineRunner{
	
	//Apache Log4j
	private static Logger log=LogManager.getLogger(ConsoleRunner.class);

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		try {
			log.info("console runner started");
			int a=10; int b=20; int c=-1;
			log.info("Data init here");
			if(a>0&&b>0) {
				c=a+b;
			log.info("If block executed");
			}else {
				c=a-b;
			log.info("else block executed");
			}
			log.debug("final result is:"+c);
			if(c>0) 
				throw new RuntimeException("hello sample");
			}
			catch(Exception e) {
				//e.printStackTrace();
				log.error("problem found:"+e);
			}
		
			//stop server
			System.exit(0);
			
		}
	}


