package example

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single
import javax.validation.constraints.NotBlank

/**
 * HelloClient
 *
 * @author debop (Sunghyouk Bae)
 * @since 18. 12. 20
 */
@Client("/")
interface HelloClient {

    @Get("/hello/{name}")
    fun hello(@NotBlank name: String): Single<String>
}