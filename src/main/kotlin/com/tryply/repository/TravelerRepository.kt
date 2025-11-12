package com.tryply.repository

import com.tryply.model.entity.TravelerEntity
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TravelerRepository : PanacheRepository<TravelerEntity> {
}