package com.tryply.repository

import com.tryply.model.entity.Activity
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class ActivityRepository : PanacheRepository<Activity> {
}