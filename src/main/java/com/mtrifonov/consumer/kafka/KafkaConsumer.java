package com.mtrifonov.consumer.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mtrifonov.consumer.repositories.MoneyTransferNoteRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mtrifonov.consumer.entities.MoneyTransferNote;

/**
 *
 * @Mikhail Trifonov
 */
@Component
public class KafkaConsumer {
    
    private final MoneyTransferNoteRepository repo;
    private final ObjectMapper mapper;

    public KafkaConsumer(MoneyTransferNoteRepository repo, ObjectMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }
    
    @KafkaListener(topics = "test-topic", groupId = "simple-listeners")
    public void listen(String message) throws JsonProcessingException {
        var entity = mapper.readValue(message, MoneyTransferNote.class);
        repo.save(entity);  
    }
}
