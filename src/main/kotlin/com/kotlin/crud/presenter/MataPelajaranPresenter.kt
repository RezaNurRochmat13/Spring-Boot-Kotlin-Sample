package com.kotlin.crud.presenter

import com.kotlin.crud.entity.MataPelajaran
import com.kotlin.crud.service.MataPelajaranServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class MataPelajaranPresenter(val mataPelajaranSvc: MataPelajaranServiceImpl) {
    @GetMapping("/education_subjects")
    fun getAllEducationSubjects(): List<MataPelajaran> {
        return mataPelajaranSvc.findAllMataPelajaran()
    }
}