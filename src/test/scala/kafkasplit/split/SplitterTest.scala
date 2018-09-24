package kafkasplit.split

import org.scalatest.{FlatSpec, Matchers}

class SplitterTest extends FlatSpec with Matchers {

  "SplitterTest" should "splitAccountPositions" in new SplitterScope {
      Splitter.splitAccountPositions(accountPositions, 2) should equal (splitAccountPositions2Chunks)
    }

}
