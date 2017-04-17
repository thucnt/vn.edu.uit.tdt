package repository;

import domain.Author;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thucnt on 12/26/16.
 */
@Repository
public interface AuthorRepository extends GraphRepository<Author> {
    @Query("MATCH (a:Author) RETURN a LIMIT 100")
    public Iterable<Author> findAllLimit100();

    @Query("MATCH (a:Author) WHERE a.name =~ {0} RETURN a LIMIT 1")
    public Author findByName(String name);
}
