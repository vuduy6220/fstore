package com.example.practialtest.responsitory;

import com.example.practialtest.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserResponsitory extends CrudRepository<User, Long> {
    List<User> findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
