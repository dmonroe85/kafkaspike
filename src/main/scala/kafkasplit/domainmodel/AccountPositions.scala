package kafkasplit.domainmodel

case class AccountPositions(accountId: String,
                            positions: List[Position])
