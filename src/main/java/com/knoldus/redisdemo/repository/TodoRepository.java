package com.knoldus.redisdemo.repository;

import com.knoldus.redisdemo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, String> {

}