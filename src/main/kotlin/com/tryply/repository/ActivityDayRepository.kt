package com.tryply.repository

import com.tryply.model.entity.ActivityDay
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ActivityDayRepository : PanacheRepository<ActivityDay> {
}