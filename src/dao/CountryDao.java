package dao;

import java.util.List;
import model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import util.HibernateUtil;

public class CountryDao extends util.GenericDao<Country, java.io.Serializable> {

    @Override
    public List<Country> list() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        try {
            List list = session.createCriteria(Country.class).addOrder(Order.asc("name")).list();
            
            return (List<Country>) list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }      
        return null;
   }
    
}
