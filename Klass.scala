class Klass(k: Int) {
  def mult(v: Int): Int = {
    k * v
  }

  def mult(v: Int, f: => Int) = {
    k * f * v 
  }
}
