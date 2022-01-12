package com.jprojects.rest.api.repository;

import com.jprojects.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
