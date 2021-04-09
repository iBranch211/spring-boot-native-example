package com.susimsek.web.bootstrap;

import com.susimsek.web.domain.Message;
import com.susimsek.web.repository.MessageRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Component
public class MessageLoader implements CommandLineRunner {

    final MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
        if(messageRepository.count()==0){
            loadMessages();
        }

    }

    private void loadMessages(){
        Message test = Message.builder()
                .message("test")
                .build();

        Message test1 = Message.builder()
                .message("test1")
                .build();

       messageRepository.save(test);
       messageRepository.save(test1);
    }
}
