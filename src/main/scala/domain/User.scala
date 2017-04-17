package domain

import org.neo4j.ogm.annotation.{GraphId, NodeEntity}
import org.springframework.data.neo4j.repository.GraphRepository

/**
  * Created by thucnt on 12/26/16.
  */
@NodeEntity
class User {
  @GraphId
  var id: java.lang.Long = _

//  @Indexed(indexName = "username", indexType = IndexType.FULLTEXT)
  var username: String = _

  override def toString = {
    "User %d %s".format(id, username)
  }
}

trait UserRepository extends GraphRepository[User]

