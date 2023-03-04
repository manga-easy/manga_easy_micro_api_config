package br.com.lucascm.mangaeasy.microconfig

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*


@Document("configs")
data class Config(
    @Id
    val id: ObjectId,
    val linkDiscord: String,
    val nivelAtivo: Boolean,
    val adsOn:  Boolean,
    val politica: String,
    val build: Int,
    val ativa_Appwrite: Boolean,
    val host_appwrite: String,
    val isViews:  Boolean,
    val isCatalog: Boolean,
    val updateApp: Long
)