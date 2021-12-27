package com.kotlin.crud.repository

import com.kotlin.crud.entity.MataPelajaran
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MataPelajaranRepository: JpaRepository<MataPelajaran, Long> {
}