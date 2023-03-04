package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.controllers
import br.com.lucascm.mangaeasy.microconfig.Config
import br.com.lucascm.mangaeasy.manga_easy_micro_api_config.repositories.ConfigRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/config")
class ConfigController(@Autowired val repo: ConfigRepository) {


    @GetMapping()
    fun list(): Config {
        return repo.findAll().last()
    }

}