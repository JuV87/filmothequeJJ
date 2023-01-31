package fr.eni.spring.repository;

import fr.eni.spring.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepo extends JpaRepository<Participant, Long> {
        }
