package com.kotlin.crud.service

import com.kotlin.crud.entity.MataPelajaran

interface MataPelajaranService {
    fun findAllMataPelajaran(): List<MataPelajaran>
}