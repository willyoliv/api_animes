package oliveira.willy.springboot2.repository;

import oliveira.willy.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AnimeRepository extends JpaRepository<Anime, Long> {
    List<Anime> findByName(String name);
}
