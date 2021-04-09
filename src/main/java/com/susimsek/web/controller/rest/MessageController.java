package com.susimsek.web.controller.rest;


import com.susimsek.web.domain.Message;
import com.susimsek.web.repository.MessageRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class MessageController {

    final MessageRepository messageRepository;

    @GetMapping(value = "/messages")
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessage(){
        return messageRepository.findAll();
    }
}
