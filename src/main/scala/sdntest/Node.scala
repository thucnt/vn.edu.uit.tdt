package sdntest

import org.neo4j.ogm.annotation.{GraphId, NodeEntity}
import org.springframework.data.neo4j.repository.GraphRepository


@NodeEntity
class Node {
  @GraphId
  private var graphId: java.lang.Long = _
}

trait NodeRepository extends GraphRepository[Node]