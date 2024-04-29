import scalikejdbc.specs2.mutable.AutoRollback
import org.specs2.mutable.*
import scalikejdbc.*

class HeaderSpec extends Specification {

  "Header" should {

    val h = Header.syntax("h")

    "find by primary keys" in new AutoRollback {
      val maybeFound = Header.find(123)
      maybeFound.isDefined should beTrue
    }
  }

}
