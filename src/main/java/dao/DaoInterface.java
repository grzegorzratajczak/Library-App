package dao;

import java.util.List;
import java.util.UUID;

public interface DaoInterface<T> {

    public void save(T entity);
    public void update(T entity);
    public T findById(UUID id);
    public void delete(T entity);
    public List<T> findAll();
    public void deleteAll();
}
