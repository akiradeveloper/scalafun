import org.scalatest._

// org.scalatest.ShouldMatchers is obsolete. use .matchers.ShouldMatchers instead
class KlassSpec extends FlatSpec with matchers.ShouldMatchers {
  "Klass" should "multiply the value" in {
    val o1 = new Klass(2)
    o1.mult(1) should equal (2)

    val o2 = new Klass(4)
    o2.mult(3) should equal (12)
  
    // Failure Case
    // o2.mult(3) should equal (11)


    // by-name parameter example
    val x = 4
    o2.mult(3, { 
      println("by-name parameter")
      x + 1
    }) should equal (60)

    o2.mult2(3) {
      println("by-name parameter 2")
      x + 1
    } should equal (60)
  }
}
