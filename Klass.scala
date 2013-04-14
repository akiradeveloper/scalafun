class Klass(k: Int) {
  def mult(v: Int): Int = {
    k * v
  }

  /*
  If we have these two methods in the same name, we got error
  [error] /home/akira/src/scala-proj-template/Klass.scala:10: double definition:
  [error] method mult:(v: Int)(f: => Int)Int and
  [error] method mult:(v: Int, f: => Int)Int at line 6
  [error] have same type after erasure: (v: Int, f: Function0)Int
  [error]   def mult(v: Int)(f: => Int) = {
  */

  def mult(v: Int, f: => Int) = {
    k * f * v 
  }

  def mult2(v: Int)(f: => Int) = {
    k * f * v
  }
}
