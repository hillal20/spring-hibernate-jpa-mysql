package springHibernateJpaMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springHibernateJpaMysql.models.Alien;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringHibernateJpaMysqlApplication {


    // to start the app , i have to do it in the terminal :
    // mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dspring.devtools.restart.enabled=false"


    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateJpaMysqlApplication.class, args);
        System.out.println(" ==== spring hibernate jpa mysql is running ==== ");


        // we can use these properties here or in the persistence.xml file
        Map properties = new HashMap();
        // properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1", properties);
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Alien a8 = new Alien();
        a8.setName("a7");
        a8.setId(8);
        a8.setTech("tech7");
        em.persist(a8);
        em.getTransaction().commit();

        // fetching data from alien table from row 4 ( id = 4)
        Alien a4 = em.find(Alien.class,4);
        System.out.println("a4 ===> "+ a4);


        em.close();
        emf.close();



    }



}
