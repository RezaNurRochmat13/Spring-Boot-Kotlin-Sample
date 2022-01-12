package com.kotlin.crud.presenter

import com.kotlin.crud.entity.MataPelajaran
import com.kotlin.crud.service.MataPelajaranServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1")
class MataPelajaranPresenter(val mataPelajaranSvc: MataPelajaranServiceImpl) {

    @GetMapping("/education_subjects")
    fun getAllEducationSubjects(): List<MataPelajaran> {
        return mataPelajaranSvc.findAllMataPelajaran()
    }

    @GetMapping("/education_subjects/{id}")
    fun getEducationSubjectById(@PathVariable id: Long): Optional<MataPelajaran> {
        return mataPelajaranSvc.findMataPelajaranById(id)
    }

    @PostMapping("/education_subjects")
    fun createEducationSubject(@RequestBody mataPelajaranPayload: MataPelajaran): MataPelajaran {
        return mataPelajaranSvc.createNewMataPelajaran(mataPelajaranPayload)
    }

    @PutMapping("/education_subjects/{id}")
    fun updateEducationSubject(@PathVariable id: Long,
    @RequestBody mataPelajaranPayload: MataPelajaran): Optional<MataPelajaran> {
       return mataPelajaranSvc.updateMataPelajaran(id, mataPelajaranPayload)
    }

    @DeleteMapping("/education_subjects/{id}")
    fun deleteEducationSubject(@PathVariable id: Long): ResponseEntity<MataPelajaran> {
        mataPelajaranSvc.deleteMataPelajaran(id)

        return ResponseEntity<MataPelajaran>(HttpStatus.OK)
    }
}