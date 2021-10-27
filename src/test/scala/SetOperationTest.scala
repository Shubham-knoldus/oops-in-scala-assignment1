import org.scalatest.funsuite.AnyFunSuite

class SetOperationTest extends AnyFunSuite{
  val setoperation = new SetOperations

  val set1: Set[Int] = Set(1, 2, 3, 4, 5,6,10,11)
  val set2: Set[Int] = Set(1,2,3,6,7,8,9)
  val set3: Set[Int] = Set(-1,-2,-3,-4,-5,-6,10,11)
  val set4: Set[Int] = Set(1,2,-3,-6,-7,8,9)


  test("Intersection"){
    val Intersection1 = setoperation.interSection(set1,set2)
    assert(Intersection1 == Set(1,2,3,6))
  }

  test("Intersection For negative element"){
    val Intersection2 = setoperation.interSection(set3,set4)
    assert(Intersection2 == Set(-3, -6))
  }

  test("Intersection by And operator"){
    val Intersection1 = setoperation.interSectionByAndOperator(set1,set2)
    assert(Intersection1 == Set(1,2,3,6))
  }

  test("Intersection by And operator For negative element"){
    val Intersection2 = setoperation.interSectionByAndOperator(set3,set4)
    assert(Intersection2 == Set(-3, -6))
  }

  test("Union"){
    val Union1 = setoperation.union(set1,set2)
    assert(Union1 == Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11) )
  }

  test("Union for negative element"){
    val Union2 = setoperation.union(set3,set4)
    assert(Union2 == Set(-7, -6, -5, -4, -3, -2, -1, 1, 2, 8, 9, 10, 11) )
  }

  test("Union by flatMap"){
    val Union1 = setoperation.unionByFlatMap(set1,set2)
    assert(Union1 == Set(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11) )
  }

  test("Union by flatMap for negative element"){
    val Union2 = setoperation.unionByFlatMap(set3,set4)
    assert(Union2 == Set(-7, -6, -5, -4, -3, -2, -1, 1, 2, 8, 9, 10, 11) )
  }


}
