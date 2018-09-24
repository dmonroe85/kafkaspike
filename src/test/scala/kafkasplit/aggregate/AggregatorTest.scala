package kafkasplit.aggregate

import kafkasplit.split.SplitterScope
import org.scalatest.{FlatSpec, Matchers}

class AggregatorTest extends FlatSpec with Matchers {

  "aggregator" should "aggregate" in new SplitterScope {
      Aggregator.aggregate(splitAccountPositions2Chunks) should equal (accountPositions)
    }

}
