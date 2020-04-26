package br.com.foursys.locadora.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.foursys.locadora.util.HibernateUtil;

/**
 *
 * @author vfurtado
 */
public abstract class GenericDAO {
// ela é uma classe generica que sempre que precisar do CRUP ela é uma cuper classe 
    // ela classe mãe e não pode ser instaciada 

    // o hibernate é inteligente ele varifica se vc esta alterando ou se esta salvando apenas chamando o metodo salvar
    @SuppressWarnings("finally")
    public boolean salvar(Object object) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            // ele tras tudo do banco de dados 
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            // e aqui vc pode dizer o que deseja fazer  
            sessao.saveOrUpdate(object);
            transacao.commit();
        } catch (Exception e) {

            transacao.rollback();
            sessao.close();

            return false;
        } finally {
            // se deu certo faça isso 
            sessao.close();
            return true;
        }

    }
// metodo criado para exclur
    public void excluir(Object object) {
        Session sessao = null;
        Transaction transacao = null;

        try {
            // ele tras tudo do banco de dados 
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            // e aqui vc pode dizer o que deseja fazer  
            sessao.delete(object);
            transacao.commit();
        } catch (Exception e) {

            transacao.rollback();
            sessao.close();

        } finally {
            // se deu certo faça isso 
            sessao.close();

        }

    }
//hibernate trabalha com anotações
}
