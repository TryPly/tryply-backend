package com.tryply.mapper

import com.tryply.dto.user.UserDTO
import com.tryply.dto.user.CreateUserDTO
import com.tryply.dto.user.RetrieveUserDTO
import com.tryply.dto.user.UpdateUserDTO
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA)
interface UserMapper {

    fun toDTO(userDTO: CreateUserDTO): UserDTO

    fun toDTO(userDTO: RetrieveUserDTO): UserDTO

    fun toDTO(userDTO: UpdateUserDTO): UserDTO

}