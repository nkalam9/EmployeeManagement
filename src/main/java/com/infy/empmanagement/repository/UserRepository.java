package com.infy.empmanagement.repository;

import com.infy.empmanagement.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {
    public List<Users> findByEmailId(String email);
    public List<Users> findByMobile(String email);
}
