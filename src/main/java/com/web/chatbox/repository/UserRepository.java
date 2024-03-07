package com.web.chatbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.chatbox.entity.Status;
import com.web.chatbox.entity.User;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User, String> {
    List<User> findAllByStatus(Status status);
    
}
