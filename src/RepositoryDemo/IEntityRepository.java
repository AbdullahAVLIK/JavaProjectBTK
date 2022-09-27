package RepositoryDemo;

public interface IEntityRepository<T extends Ientity> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
