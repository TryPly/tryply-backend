package com.planit.repository

import com.planit.model.entity.ActivityDay
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ActivityDayRepository : PanacheRepository<ActivityDay> {
}