package example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * HelloController
 *
 * @author debop (Sunghyouk Bae)
 * @since 18. 12. 20
 */
@Controller("/")
class HelloController {

    @Get("/hello/{name}")
    fun hello(name: String): String {
        return "Hello $name"
    }
}