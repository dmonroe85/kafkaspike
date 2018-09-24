package kafkasplit.split

import org.scalatest.{FlatSpec, Matchers}

class SplitterUtilTest extends FlatSpec with Matchers {

  "SplitterUtilTest" should "getTotalChunks" in new SplitterScope {
      SplitterUtil.getTotalChunks(accountPositions, 2) should be (2)
      SplitterUtil.getTotalChunks(accountPositions, 3) should be (2)
      SplitterUtil.getTotalChunks(accountPositions, 4) should be (1)
      SplitterUtil.getTotalChunks(accountPositions, 5) should be (1)
    }

}

