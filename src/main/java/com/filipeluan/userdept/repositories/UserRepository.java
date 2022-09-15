package com.filipeluan.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipeluan.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
