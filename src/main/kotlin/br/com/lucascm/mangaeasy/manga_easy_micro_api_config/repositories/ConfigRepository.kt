package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.repositories

import br.com.lucascm.mangaeasy.microconfig.Config
import org.springframework.data.mongodb.repository.MongoRepository

interface ConfigRepository : MongoRepository<Config, String> {

}