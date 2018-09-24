package kafkasplit.domainmodel

import java.util.Date

case class Position(positionId: String,
                    positionDate: Date,
                    security: String,
                    amount: Double)
