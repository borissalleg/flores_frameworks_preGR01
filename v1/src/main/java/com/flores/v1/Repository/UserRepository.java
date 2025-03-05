package com.flores.v1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flores.v1.Model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
 
    
}
