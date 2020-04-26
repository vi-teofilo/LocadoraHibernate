
package br.com.foursys.locadora.util;

/**
 *
 * @author vfurtado
 */
public class GeraTabelas {
    
   public static void main(String[] args) {
//       open abre a senção de acordo com vc tem na conf
       HibernateUtil.getSessionFactory().openSession();
       System.out.println("Tabela criada com sucesso!");
       System.exit(0);
       
// TODO code application logic here
    } 
}
