package sdntest

import org.springframework.data.util.CloseableIterator

import scala.util._

/**
  * Created by thucnt on 12/26/16.
  */
class ScalaCloseableIterable[T](ci: CloseableIterator[T]) {

  def foreach[U](f: (T) => U) {
    /*val i = ci.iterator()
    try {
      while (i.hasNext) {
        val t = i.next()
        f(t)
      }
    } finally {
      ci.close()
    }*/
  }
}