package example

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Test

/**
 * HelloControllerTest
 *
 * @author debop (Sunghyouk Bae)
 * @since 18. 12. 20
 */
class HelloControllerTest {

    val server = ApplicationContext.run(EmbeddedServer::class.java)
    val helloClient = server.applicationContext.getBean(HelloClient::class.java)

    @Test
    fun `call hello`() {
        helloClient.hello("Debop").blockingGet() shouldEqual "Hello Debop"
    }
}