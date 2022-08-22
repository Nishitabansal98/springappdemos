package com.examples.S02Autowiring;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
import com.samples.S02Autowiring.model.Employee;
public class App 
{
    public static void main( String[] args )
    {
    	// create the spring container
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/examples/S02Autowiring/SpringConfig.xml");
       
       Employee emp = (Employee) springContainer.getBean("emp"); 
       System.out.println(emp);
       
    }
}
