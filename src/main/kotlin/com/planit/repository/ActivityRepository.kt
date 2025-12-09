package com.planit.repository

import com.planit.model.entity.Activity
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ActivityRepository : PanacheRepository<Activity> {
}