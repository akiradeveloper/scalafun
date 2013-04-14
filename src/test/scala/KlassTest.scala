import org.scalatest._

// org.scalatest.ShouldMatchers is obsolete. use .matchers.ShouldMatchers instead
class KlassSpec extends FlatSpec with matchers.ShouldMatchers {
  "Klass" should "multiply the value" in {
    val o1 = new Klass(2)
    o1.mult(1) should equal (2)

    val o2 = new Klass(4)
    o2.mult(3) should equal (12)
  
    // Failure Case
    o2.mult(3) should equal (11)
  }
}
