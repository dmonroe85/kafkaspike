package kafkasplit.split

import kafkasplit.domainmodel.AccountPositions

object SplitterUtil {

  def getTotalChunks(accountPositions: AccountPositions,
                     chunkSize: Int): Int =
    accountPositions.positions.length / chunkSize +
      ( if(accountPositions.positions.length % chunkSize == 0) 0 else 1 )

}
