package com.bilgeadam.TelefonShowroom.utility.manager;


import java.util.List;

public interface IService <T,ID>{
    T save(T entity);
    Iterable<T> saveAll(Iterable<T> entitites);
    T update(T entity);
    void delete(T t);
    void deleteById(ID id);
    List<T> findAll();
}