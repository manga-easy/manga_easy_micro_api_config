package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("ToggleConfig")
data class ToggleConfigEntity(
    @Id
    val id: String?,
    val name: String,
    var updateAt: Long?,
    var status:  StatusToggleEnum,
    val description: String,
    val value: Any
)