package com.web.chatbox.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.web.chatbox.entity.Status;
import com.web.chatbox.entity.User;
import com.web.chatbox.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository repository;

	public void saveUser(User user) {
		user.setStatus(Status.ONLINE);
		repository.save(user);
	}

	public void disconnect(User user) {
		var storedUser = repository.findById(user.getFullName()).orElse(null);
		if (storedUser != null) {
			storedUser.setStatus(Status.OFFLINE);
			repository.save(storedUser);
		}
	}

	public List<User> findConnectedUsers() {
		return repository.findAllByStatus(Status.ONLINE);
	}
}
