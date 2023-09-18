package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Chat;
import com.demo.services.ChatService;

@RestController
@RequestMapping("/chat")
public class ChatController {
	
	@Autowired
	ChatService chatService;

	@PostMapping
	public Chat createMessage(@RequestBody Chat chat) {
		return chatService.createMessage(chat);
	}
	
	
	@GetMapping
	public List<Chat> getAllChat(){
		return chatService.getAll();
		
	}
	
	
	@GetMapping("/{id}")
	public Chat getMessageById(@PathVariable long id) {
		return chatService.getMessageById(id);
		
	}
}
