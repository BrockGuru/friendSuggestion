package com.friendsuggestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.friendsuggestion.entity.UserFriend;

@Repository
public interface UserFriendRepository extends JpaRepository<UserFriend,Long>{
	
}
