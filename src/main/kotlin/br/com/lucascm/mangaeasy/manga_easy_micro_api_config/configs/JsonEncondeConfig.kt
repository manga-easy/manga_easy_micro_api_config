package br.com.lucascm.mangaeasy.manga_easy_micro_api_config.configs

import com.nimbusds.jose.jwk.source.ImmutableSecret
import com.nimbusds.jose.proc.SecurityContext
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.jwt.JwtDecoder
import org.springframework.security.oauth2.jwt.JwtEncoder
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder
import javax.crypto.spec.SecretKeySpec

@Configuration
class JwtEncodingConfig(
    @Value("\${security.key}")
    private val jwtKey: String

) { private val logger: KotlinLogging = KotlinLogging
    private val secretKey = SecretKeySpec(jwtKey.toByteArray(), "HS256")

    @Bean
    fun jwtDecoder(): JwtDecoder {
        logger.logger("JwtEncodingConfig").info(jwtKey)
        return NimbusJwtDecoder.withSecretKey(secretKey).build()
    }

    @Bean
    fun jwtEncoder(): JwtEncoder {
        val secret = ImmutableSecret<SecurityContext>(secretKey)
        return NimbusJwtEncoder(secret)
    }
}