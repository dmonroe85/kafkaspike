package kafkasplit.aggregate

import kafkasplit.domainmodel.AccountPositions
import kafkasplit.split.PositionChunk

object Aggregator {

  def aggregate(chunks: List[PositionChunk]): AccountPositions =
    AccountPositions(chunks.head.accountId, chunks.flatMap(x => x.chunkedPositions))

}
