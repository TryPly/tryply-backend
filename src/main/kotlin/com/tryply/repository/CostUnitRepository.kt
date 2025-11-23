package com.tryply.repository

import com.tryply.model.entity.CostUnit
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class CostUnitRepository : PanacheRepository<CostUnit> {
}