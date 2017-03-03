package com.subra.princip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subra.buiss.TeamBusinessInterface;
import com.subra.model.Teams;




public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("config/BeanLocationFile.xml");
	
    	TeamBusinessInterface teamBusinessInterface = (TeamBusinessInterface)appContext.getBean("TeamBusinessInterface");
    	
    	/** insert **/
    	Teams team = new Teams();
    	team.setName("Bobcat");
    	team.setRating(312L);
    	teamBusinessInterface.save(team);
    	
    	/** select **/
    	Teams team2 = teamBusinessInterface.findByTeamId(312L);
    	System.out.println(team2);
    	
    	/** update **/
    	team2.setName("Yankee");
    	teamBusinessInterface.update(team2);
    	
    	/** delete **/
    	teamBusinessInterface.delete(team2);
    	
    	System.out.println("Done");
    }
}

