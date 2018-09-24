package kafkasplit.split

import java.util.Date

import kafkasplit.domainmodel.{AccountPositions, Position}
import org.specs2.specification.Scope

trait SplitterScope extends Scope {
  private val accountId = "12345"

  private val date = new Date()
  private val security = "AAPL"
  private val amount = 0.0

  private val positions = List(
    Position(positionId = "1", date, security, amount),
    Position(positionId = "2", date, security, amount),
    Position(positionId = "3", date, security, amount),
    Position(positionId = "4", date, security, amount)
  )

  val accountPositions = AccountPositions(accountId, positions)

  val splitAccountPositions2Chunks = List(
    PositionChunk(accountId, List(
            Position(positionId = "1", date, security, amount),
            Position(positionId = "2", date, security, amount)
          ), 0, 2),
    PositionChunk(accountId, List(
            Position(positionId = "3", date, security, amount),
            Position(positionId = "4", date, security, amount)
          ), 1, 2)
  )

  val outOfOrderChunks = List(
    PositionChunk(accountId, List(
      Position(positionId = "3", date, security, amount),
      Position(positionId = "4", date, security, amount)
    ), 1, 2),
    PositionChunk(accountId, List(
      Position(positionId = "1", date, security, amount),
      Position(positionId = "2", date, security, amount)
    ), 0, 2)
  )
}
