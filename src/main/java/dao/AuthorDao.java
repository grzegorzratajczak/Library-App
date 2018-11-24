package dao;


import config.HibernateUtils;
import model.Author;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class AuthorDao implements DaoInterface<Author> {


    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = HibernateUtils.getConnection();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void closeCurrentSession() {
        currentTransaction.commit();
        currentSession.close();
    }

    @Override
    public void save(Author entity) {
        getCurrentSession().save(entity);
    }

    @Override
    public void update(Author entity) {
        getCurrentSession().update(entity);
    }

    @Override
    public Author findById(int id) {
        Author author = getCurrentSession().get(Author.class, id);
        return author;
    }

    @Override
    public void delete(Author entity) {
        getCurrentSession().delete(entity);
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors = getCurrentSession().createQuery(
                "FROM " + Author.class.getName()).list();
        return authors;
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM author";
        Query query = getCurrentSession().createQuery(sql);
        query.executeUpdate();
    }
}
