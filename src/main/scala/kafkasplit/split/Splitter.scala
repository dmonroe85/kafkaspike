package kafkasplit.split

import kafkasplit.domainmodel.{AccountPositions, Position}

object Splitter {

  def splitAccountPositions(accountPositions: AccountPositions,
                            chunkSize: Int): List[PositionChunk] = {
    val size = SplitterUtil.getTotalChunks(accountPositions, 2)
    accountPositions
      .positions
      .sliding(chunkSize, chunkSize)
      .zipWithIndex
      .map(x => PositionChunk(accountPositions.accountId, x._1.toList, x._2, size))
      .toList
  }

}


