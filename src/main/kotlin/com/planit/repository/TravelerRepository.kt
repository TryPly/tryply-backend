package com.planit.repository

import com.planit.model.entity.Traveler
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TravelerRepository : PanacheRepository<Traveler> {
}