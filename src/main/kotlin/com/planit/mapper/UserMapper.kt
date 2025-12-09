package com.planit.mapper

import com.planit.dto.user.UserDTO
import com.planit.dto.user.CreateUserDTO
import com.planit.dto.user.RetrieveUserDTO
import com.planit.dto.user.UpdateUserDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface UserMapper {

    fun toDTO(userDTO: CreateUserDTO): UserDTO

    fun toDTO(userDTO: RetrieveUserDTO): UserDTO

    fun toDTO(userDTO: UpdateUserDTO): UserDTO

}