package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.mappers

import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.dtos.ToggleDto
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.StatusToggleEnum
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.ToggleConfigEntity
import org.bson.types.ObjectId
import java.time.Instant

class ToggleEntityMapper {
   fun toDto(dto: ToggleDto): ToggleConfigEntity{
       return ToggleConfigEntity(
           status = dto.status ?: StatusToggleEnum.DISABLE,
           value = dto.value,
           updateAt = dto.updateAt ?: Instant.now().epochSecond,
           name = dto.name,
           description = dto.description ?: "",
           id = dto.id
       )
   }

    fun fromDto(entity: ToggleConfigEntity) :ToggleDto{
        return ToggleDto(
            id = entity.id.toString(),
            description = entity.description,
            name = entity.name,
            status = entity.status,
            updateAt = entity.updateAt,
            value = entity.value
        )
    }
}