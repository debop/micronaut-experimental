package example

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
        assertEquals("Hello Debop", helloClient.hello("Debop").blockingGet())
    }
}