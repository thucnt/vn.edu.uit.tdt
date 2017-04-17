package repository;

import domain.Paper;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thucnt on 12/26/16.
 */
@Repository
public interface PaperRepository extends GraphRepository<Paper> {
    @Query("MATCH p=()-[r:CITING]->q=() RETURN q LIMIT 25")
    public Iterable<Paper> findAllLimit100();
}
