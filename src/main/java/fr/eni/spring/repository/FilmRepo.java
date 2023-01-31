package fr.eni.spring.repository;

import fr.eni.spring.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository<Film, Long> {
}
