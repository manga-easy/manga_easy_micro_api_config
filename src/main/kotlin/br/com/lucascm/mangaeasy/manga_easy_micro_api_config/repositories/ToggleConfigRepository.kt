package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.repositories

import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.ToggleConfigEntity
import org.springframework.data.mongodb.core.query.TextCriteria
import org.springframework.data.mongodb.core.query.TextQuery
import org.springframework.data.mongodb.repository.MongoRepository

interface ToggleConfigRepository : MongoRepository<ToggleConfigEntity, String> {
    fun findByName(name: String): List<ToggleConfigEntity>

}