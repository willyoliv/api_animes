package oliveira.willy.springboot2.repository;

import oliveira.willy.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
