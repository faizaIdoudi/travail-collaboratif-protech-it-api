package com.demo.services;

import java.util.List;

import com.demo.entities.Chat;

public interface ChatService {
	public Chat createMessage( Chat chat);
	public List<Chat> getAll();
	public Chat getMessageById(long id);

}
