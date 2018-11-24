//package dao;
//
//import config.HibernateUtils;
//import model.Book;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import javax.persistence.Query;
//import java.util.List;
//
//public class BookDao implements DaoInterface<Book> {
//
//    private Session currentSession;
//    private Transaction currentTransaction;
//
//    public Session openCurrentSession() {
//        currentSession = (Session) HibernateUtils.getConnection();
//        currentTransaction = currentSession.beginTransaction();
//        return currentSession;
//    }
//
//    public Session getCurrentSession() {
//        return currentSession;
//    }
//
//    public void closeCurrentSession() {
//        currentTransaction.commit();
//        currentSession.close();
//    }
//
//    @Override
//    public void save(Book entity) {
//        getCurrentSession().save(entity);
//    }
//
//    @Override
//    public void update(Book entity) {
//        getCurrentSession().update(entity);
//    }
//
//    @Override
//    public Book findById(int id) {
//        Book book = getCurrentSession().get(Book.class, id);
//        return book;
//    }
//
//    @Override
//    public void delete(Book entity) {
//        getCurrentSession().delete(entity);
//    }
//
//    @Override
//    public List<Book> findAll() {
//        List<Book> books = getCurrentSession().createQuery(
//                "FROM " + Book.class.getName()).list();
//        return books;
//    }
//
//    @Override
//    public void deleteAll() {
//        String sql = "DELETE FROM book";
//        Query query = getCurrentSession().createQuery(sql);
//        query.executeUpdate();
//    }
//}
