package com.susimsek.web.controller.rest;


import com.susimsek.web.model.MessageDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class MessageController {


    @GetMapping(value = "/message")
    @ResponseStatus(HttpStatus.OK)
    public MessageDto getMessage(){
        return MessageDto.builder()
                .message("Hello world!!!")
                .build();
    }
}
