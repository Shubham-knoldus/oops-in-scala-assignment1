class SetOperations {

  def interSectionByAndOperator (Set1: Set[Int], Set2: Set[Int]): Set[Int]={

    val NewSet = Set1 & Set2
    NewSet
  }

  def interSection (Set1: Set[Int], Set2: Set[Int]): Set[Int]={

    var Set3: Set[Int] = Set()

    for (Set1 <- Set1) {
      for (Set2 <- Set2) {
        if (Set1 == Set2) {
          Set3 += Set1
        }
      }
    }
  Set3
  }

  def union (Set1: Set[Int], Set2: Set[Int]): Set[Int] = {

    var Set3: Set[Int] = Set()

    for (Set1 <- Set1) {
      for (Set2 <- Set2) {
        Set3 += Set1
      }
    }

    var Set4 = Set3

    for (Set2 <- Set2){
      for (_ <- Set3){
        if (Set2 != Set3) {
          Set4 += Set2
        }
      }
    }
    val SortSet4 = collection.immutable.SortedSet[Int]() ++ Set4
    SortSet4
  }

  def unionByFlatMap[Int](set1: Set[Int], set2:Set[Int]):Set[Int] = {
    val Set3 = set1
    Set3.flatMap(elem => set2 + elem)
  }
}
