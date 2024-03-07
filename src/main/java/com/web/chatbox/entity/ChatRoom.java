package com.web.chatbox.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ChatRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String chatId;
    private String senderId;
    private String recipientId;
}
