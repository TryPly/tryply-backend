package com.tryply.service

import jakarta.enterprise.context.ApplicationScoped
import jakarta.transaction.Transactional

@ApplicationScoped
@Transactional
class CostService {

    fun addCost(): String {
        // Implementation for adding a cost goes here
        return "Cost added"
    }

    fun getCosts(): String {
        // Implementation for retrieving costs goes here
        return "List of costs"
    }

    fun getCostById(): String {
        // Implementation for retrieving a cost by ID goes here
        return "Cost details"
    }

    fun updateCost(): String {
        // Implementation for updating a cost goes here
        return "Cost updated"
    }

    fun deleteCost(): String {
        // Implementation for deleting a cost goes here
        return "Cost deleted"
    }

}