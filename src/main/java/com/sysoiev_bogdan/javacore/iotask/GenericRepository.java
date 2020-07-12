package com.sysoiev_bogdan.javacore.iotask;

import java.io.IOException;
import java.util.List;

public interface GenericRepository<T, ID> {

    T getById(ID id);

    void deleteById(ID id);

    T update(T item) throws IOException;

    T save(T item);

    List<T> getAll();

}
