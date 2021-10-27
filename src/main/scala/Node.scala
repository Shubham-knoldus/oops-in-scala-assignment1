import scala.annotation.tailrec

case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree {

  override def contains(v: Int): Boolean = {
    @tailrec
    def contains(t: IntTree, v: Int): Boolean = t match {
      case EmptyTree => false
      case Node(element, left, right) =>
        if (v < element) contains(left, v)
        else if (v > element) contains(right, v)
        else true
    }
    contains(this, v)
  }

  override def insert(x: Int): IntTree = {
    def insert(t: IntTree, v: Int): IntTree = t match {
      case EmptyTree => Node(v, EmptyTree, EmptyTree)
      case Node(element, left, right) =>
        if (v < element) Node(element, insert(left, v), right)
        else if (v > element) Node(element, left, insert(right, v))
        else t
    }

    insert(this, x)
  }
}
