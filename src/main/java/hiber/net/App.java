package hiber.net;
import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      Student S = new Student();
      S.setId(1);
      S.setName("chandni");
      S.setPlace("Kottayam");
      
      Employee e = new Employee();
      e.setId(2);
      e.setName(" dona");     
      e.setPlace("some village");
      S.setE(e);
     Configuration  c = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Employee.class);
      SessionFactory sf = c.buildSessionFactory();
      Session session =  sf.openSession();
      Transaction t = session.beginTransaction();
      
      session.save(e);
      session.save(S);
      
      t.commit();
  	System.out.println(S);
    }
}

