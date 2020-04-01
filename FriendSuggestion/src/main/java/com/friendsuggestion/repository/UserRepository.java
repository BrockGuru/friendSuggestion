package com.friendsuggestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.friendsuggestion.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
