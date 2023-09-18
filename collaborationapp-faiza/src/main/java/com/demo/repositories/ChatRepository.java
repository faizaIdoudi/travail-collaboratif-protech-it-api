package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Chat;

public interface ChatRepository extends JpaRepository<Chat, Long> {

}
