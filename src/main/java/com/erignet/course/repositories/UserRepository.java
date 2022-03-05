package com.erignet.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erignet.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
