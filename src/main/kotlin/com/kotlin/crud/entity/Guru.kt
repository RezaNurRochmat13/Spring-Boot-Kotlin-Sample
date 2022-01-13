package com.kotlin.crud.entity


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gurus")
data class Guru(
    @Id @Column(name = "id") val id: Long = 0L,
    @Column(name = "name") val name: String = "",
    @Column(name = "description") val description: String)
