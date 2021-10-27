import org.scalatest.funsuite.AnyFunSuite
class TestIntTree extends  AnyFunSuite {
  val inttree = Node(1,EmptyTree,EmptyTree)
  assert(inttree.contains(1) == true)

  assert(inttree.contains(2)== false)

}
