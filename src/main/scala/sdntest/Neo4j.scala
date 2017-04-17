package sdntest

import domain.{User, UserRepository}
import org.springframework.context.support.GenericXmlApplicationContext

/**
  * Created by thucnt on 12/26/16.
  */
object Neo4j {

  def main(args: Array[String]) {
    val ac = new GenericXmlApplicationContext(
      "classpath*:/META-INF/spring/module-context.xml")
    val ur = ac.getBean(classOf[UserRepository])

    val u = new User
    u.username = "foo"
    ur.save(u)

//    for (u < - ur.findAll()) println(u)  (1)

    ac.close()
  }
}