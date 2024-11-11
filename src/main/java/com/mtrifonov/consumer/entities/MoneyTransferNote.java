package com.mtrifonov.consumer.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @Mikhail Trifonov
 */
@Entity
@Table(name = "money_transfer_note")
@Data
@NoArgsConstructor
public class MoneyTransferNote {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="note_seq")
    @SequenceGenerator(name="note_seq", sequenceName="money_transfer_note_id_seq", allocationSize = 1)
    private int id;
    
    @Column(name = "sender_id")
    private int senderId;
    
    @Column(name = "recipient_id")
    private int recipientId;
    
    private int amount;
    
    private String message;    
}
