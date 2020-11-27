package com.javatpoint.jpaexample.repository;

import com.javatpoint.jpaexample.model.UserRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRecord,String> {
}
