package com.mtrifonov.consumer.repositories;

import com.mtrifonov.consumer.entities.MoneyTransferNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @Mikhail Trifonov
 */
@Repository
public interface MoneyTransferNoteRepository extends JpaRepository<MoneyTransferNote, Integer> {
}
