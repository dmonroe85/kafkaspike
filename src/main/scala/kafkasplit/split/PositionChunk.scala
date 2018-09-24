package kafkasplit.split

import kafkasplit.domainmodel.Position

case class PositionChunk(accountId: String,
                         chunkedPositions: List[Position],
                         chunkIdx: Int,
                         totalChunks: Int)
