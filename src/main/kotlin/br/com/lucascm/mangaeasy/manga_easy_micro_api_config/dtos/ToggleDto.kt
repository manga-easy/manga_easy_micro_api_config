package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.dtos

import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.StatusToggleEnum
import lombok.Getter
import lombok.Setter
import org.bson.types.ObjectId
class ToggleDto(
    val id: String?,
    val name: String,
    var updateAt: Long?,
    var status: StatusToggleEnum?,
    val description: String?,
    val value: Any
)