package com.planit.repository

import com.planit.model.entity.Travel
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TravelRepository : PanacheRepository<Travel> {

}