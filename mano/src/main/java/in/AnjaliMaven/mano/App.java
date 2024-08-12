package in.AnjaliMaven.mano;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.context.ConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
      
        String query = "create database Anjali";
        JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
        jT.update(query);
        System.out.println("created");
        
    }
}
