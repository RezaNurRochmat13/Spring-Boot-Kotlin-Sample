package com.kotlin.crud.service

import com.kotlin.crud.entity.MataPelajaran
import java.util.*

interface MataPelajaranService {
    fun findAllMataPelajaran(): List<MataPelajaran>
    fun findMataPelajaranById(id: Long): Optional<MataPelajaran>
    fun createNewMataPelajaran(payload: MataPelajaran): MataPelajaran
    fun updateMataPelajaran(id: Long, payload: MataPelajaran): Optional<MataPelajaran>
    fun deleteMataPelajaran(id: Long)
}