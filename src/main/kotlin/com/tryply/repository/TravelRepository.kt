package com.tryply.repository

import com.tryply.model.entity.Travel
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TravelRepository : PanacheRepository<Travel> {

}