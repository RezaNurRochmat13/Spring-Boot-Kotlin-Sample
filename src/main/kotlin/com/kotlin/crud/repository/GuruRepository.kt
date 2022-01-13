package com.kotlin.crud.repository

import com.kotlin.crud.entity.Guru
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GuruRepository: JpaRepository<Guru, Long> {
}