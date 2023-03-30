package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities

class ResultEntity<T>(
    val status: StatusResultEnum,
    val message: String?,
    val total : Int,
    val data : List<T>
)