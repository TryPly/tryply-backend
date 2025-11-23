package com.tryply.repository

import com.tryply.model.entity.Cost
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CostRepository : PanacheRepository<Cost> {
}