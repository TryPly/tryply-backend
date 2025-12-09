package com.planit.repository

import com.planit.model.entity.User
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheRepository<User> {
}