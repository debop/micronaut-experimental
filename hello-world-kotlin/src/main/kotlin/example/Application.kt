package example

import io.micronaut.runtime.Micronaut

/**
 * The application is defined in this way so we can easily reference
 * a class to pass to [start][io.micronaut.runtime.Micronaut.start].
 *
 * @author debop (Sunghyouk Bae)
 * @since 18. 12. 20
 */
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
            .packages("example")
            .mainClass(Application.javaClass)
            .start()
    }
}