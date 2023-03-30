package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.controllers

import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.dtos.ToggleDto
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.ResultEntity
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.StatusResultEnum
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.entities.ToggleConfigEntity
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.mappers.ToggleEntityMapper
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.repositories.ToggleConfigRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/toggle")
class ToggleConfigController(@Autowired val repo: ToggleConfigRepository) {
    @GetMapping("/search")
    fun list(@RequestParam("name") name: String?): ResultEntity<Any> {
        try {
            var values = listOf<ToggleConfigEntity>()
            if (name == null){
                values =  repo.findAll()
            }else{
                values = repo.findByName(name)
            }
            return ResultEntity(
                total = values.size,
                status = StatusResultEnum.SUCCESS,
                data = values,
                message = "Listado com sucesso"
            )
        } catch (e: Exception) {
            return ResultEntity<Any>(
                total = 0,
                status = StatusResultEnum.ERROR,
                data = listOf(),
                message = e.message
            );
        }
    }

    @PutMapping()
    @ResponseBody()
    fun update( @RequestBody() body: ToggleDto): ResultEntity<Any> {
        try {
            val entity = ToggleEntityMapper().toDto(body)
            val result = repo.save(entity)
            return ResultEntity<Any>(
                total = 1,
                status = StatusResultEnum.SUCCESS,
                data = listOf(result),
                message = "Toggle salvo com sucesso Id ${result.id}"
            );
        } catch (e: Exception) {
            return ResultEntity<Any>(
                total = 0,
                status = StatusResultEnum.ERROR,
                data = listOf(),
                message = e.message
            );
        }
    }
    @GetMapping("/{id}")
    @ResponseBody()
    fun getId( @PathVariable id: String): Any {
        try {
            val result = repo.findById(id)
            if (result.isEmpty) throw Exception("Toggle não existe")
            return ResultEntity<Any>(
                total = 1,
                status = StatusResultEnum.SUCCESS,
                data = listOf(result),
                message = "Toggle retornado com sucesso Id ${result.get().id}"
            );
        } catch (e: Exception) {
            return ResultEntity<Any>(
                total = 0,
                status = StatusResultEnum.ERROR,
                data = listOf(),
                message = e.message
            );
        }
    }
    @DeleteMapping("/{id}")
    @ResponseBody()
    fun delete( @PathVariable id: String): Any {
        try {
            val verify = repo.findById(id)
            if (verify.isEmpty) throw Exception("Toggle não existe")
            val result = repo.deleteById(id)
            return ResultEntity<Any>(
                total = 1,
                status = StatusResultEnum.SUCCESS,
                data = listOf(result),
                message = "Toggle deletado com sucesso Id $id"
            );
        } catch (e: Exception) {
            return ResultEntity<Any>(
                total = 0,
                status = StatusResultEnum.ERROR,
                data = listOf(),
                message = e.message
            );
        }
    }
}