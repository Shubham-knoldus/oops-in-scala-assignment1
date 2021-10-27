case object EmptyTree extends IntTree {

  override def insert(x: Int): IntTree = Node(x, EmptyTree, EmptyTree)

  override def contains(v: Int): Boolean = false
}
