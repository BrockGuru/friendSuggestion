package com.friendsuggestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.friendsuggestion.entity.UserFriend;

@Repository
public interface UserFriendRepository extends JpaRepository<UserFriend,Long>{

	List<UserFriend> findAllById(Long user_id);
	
}
