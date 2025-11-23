package com.tryply.utils

import com.tryply.dto.cost.CostDTO
import com.tryply.dto.costunit.CostUnitDTO
import com.tryply.model.entity.Cost
import com.tryply.model.entity.CostUnit
import com.tryply.model.entity.Traveler
import java.math.BigDecimal
import java.math.RoundingMode


class CostUtils {

    fun generateCostsUnitsEvenly(
        cost: CostDTO,
        travelers: List<Traveler>
    ): List<CostUnit> {
        val costUnits = mutableListOf<CostUnit>()
        val splitAmount = BigDecimal(cost.totalAmount / travelers.size, ).setScale(2, RoundingMode.HALF_EVEN).toDouble()

        for (traveler in travelers) {
            val costUnit = CostUnit().apply {
                this.amount = splitAmount
                this.currency = cost.currency
                this.traveler = traveler
            }
            costUnits.add(costUnit)
        }

        return costUnits
    }


    fun generateCostsUnitsEvenly(
        cost: Cost,
        travelers: List<Traveler>
    ): List<CostUnit> {
        val costUnits = mutableListOf<CostUnit>()
        val splitAmount = BigDecimal(cost.amount / travelers.size, ).setScale(2, RoundingMode.HALF_EVEN).toDouble()

        for (traveler in travelers) {
            val costUnit = CostUnit().apply {
                this.amount = splitAmount
                this.currency = cost.currency
                this.traveler = traveler
                this.cost = cost
            }
            costUnits.add(costUnit)
        }

        return costUnits
    }


    fun generateCostUnitWithCustomAmount(
        cost : CostDTO,
        costUnitList: List<CostUnitDTO>,
        travelers: List<Traveler>
    ) : List<CostUnit> {
        val costUnits = mutableListOf<CostUnit>()

        for (costUnitDTO in costUnitList) {
            val traveler = travelers.find { it.user.username == costUnitDTO.travelerUsername }
                ?: continue

            val costUnit = CostUnit().apply {
                this.amount = costUnitDTO.amount ?: 0.0
                this.currency = cost.currency
                this.traveler = traveler
            }
            costUnits.add(costUnit)
        }

        return costUnits
    }

    fun generateCostUnitWithCustomAmount(
        cost : Cost,
        costUnitList: List<CostUnitDTO>,
        travelers: List<Traveler>
    ) : List<CostUnit> {
        val costUnits = mutableListOf<CostUnit>()

        for (costUnitDTO in costUnitList) {
            val traveler = travelers.find { it.user.username == costUnitDTO.travelerUsername }
                ?: continue

            val costUnit = CostUnit().apply {
                this.amount = costUnitDTO.amount ?: 0.0
                this.currency = cost.currency
                this.traveler = traveler
                this.cost = cost
            }
            costUnits.add(costUnit)
        }

        return costUnits
    }


}