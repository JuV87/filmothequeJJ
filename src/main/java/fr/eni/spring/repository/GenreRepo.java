package fr.eni.spring.repository;

import fr.eni.spring.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Long> {
}
