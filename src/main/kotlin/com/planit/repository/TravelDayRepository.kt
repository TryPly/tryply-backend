package com.planit.repository

import com.planit.model.entity.TravelDay
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TravelDayRepository : PanacheRepository<TravelDay> {
}