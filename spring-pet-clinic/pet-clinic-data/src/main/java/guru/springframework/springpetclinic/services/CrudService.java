package guru.springframework.springpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    T findBtId(ID id);
    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
