import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDatabaseController {

    private SessionFactory factory;


    public void create(Object obj){

        Session session = factory.getCurrentSession();

        try {
            // start transaction
            session.beginTransaction();

            // save the student
            session.save(obj);

            // commit the transaction
            session.getTransaction().commit();

        } catch (Exception e){
            e.printStackTrace();
            closeController();
        }

    }

//    public Object read(Object obj){
//
//    }
//
//    public void update(Object obj){
//
//    }
//
//    public void delete(Object obj){
//
//    }

    public HibernateDatabaseController(Object objectToControl) {
        this.factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(objectToControl.getClass()).buildSessionFactory();;
    }

    public void closeController(){
        factory.close();
    }
}
