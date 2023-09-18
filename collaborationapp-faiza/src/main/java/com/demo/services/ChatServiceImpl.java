package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Chat;
import com.demo.repositories.ChatRepository;

@Service
public class ChatServiceImpl implements ChatService{
	
	@Autowired
	ChatRepository chatRepository;

	@Override
	public Chat createMessage(Chat chat) {
		// TODO Auto-generated method stub
		return chatRepository.save(chat);
	}

	@Override
	public List<Chat> getAll() {
		// TODO Auto-generated method stub
		return chatRepository.findAll();
	}

	@Override
	public Chat getMessageById(long id) {
		// TODO Auto-generated method stub
		return chatRepository.findById(id).get();
	}

}
