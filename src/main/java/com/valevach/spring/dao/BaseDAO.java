package com.valevach.spring.dao;

public interface BaseDAO <T>{
    void create(T entity);

    T read(Integer id);

    void delete(T entity);

    void update(T entity);
}
