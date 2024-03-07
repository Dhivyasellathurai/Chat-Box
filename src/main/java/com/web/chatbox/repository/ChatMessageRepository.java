package com.web.chatbox.repository;



import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.chatbox.entity.ChatMessage;
@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage,UUID> {
    List<ChatMessage> findByChatId(String chatId);
}
