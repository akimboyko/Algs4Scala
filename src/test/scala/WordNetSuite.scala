import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class WordNetSuite extends FunSuite {
  test("one plus one is two")(assert(1 + 1 == 2))

  test("WordNet not implemented yet") {
    intercept[UnsupportedOperationException] {
      new WordNet("synsets", "hypernym")
    }
  }
}