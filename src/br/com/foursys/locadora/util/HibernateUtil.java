
package br.com.foursys.locadora.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author vfurtado
 */
public class HibernateUtil {
    
//    a connection é a mesma coisa de seção em hibernate
    private static final SessionFactory sessionFactory= bildSessionFactory();
            
//    é preciso geral uma instancia pro objeto por isso tem o Annotation que esta dentro do metodo para pegar apenas 
//    as info encapsuladas com o configure
    private static SessionFactory bildSessionFactory(){
        return new AnnotationConfiguration().configure().buildSessionFactory();
        
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    
}
