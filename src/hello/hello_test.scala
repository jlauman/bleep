package hello

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.{DisplayName, Test}
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(classOf[JUnitPlatform])
class TestSuite:
    @DisplayName("test the answer")
    @Test def testTheAnswer: Unit =
        val expected = 42
        val obtained = 42
        assertEquals(expected, obtained)

    @DisplayName("test strings")
    @Test def testStrings: Unit =
        val expected = "Hello!"
        val obtained = "Hello!"
        assertEquals(expected, obtained)

    @DisplayName("test integers")
    @Test def testIntegers: Unit =
        val expected = 1
        val obtained = 1.0
        assertEquals(expected, obtained, 0.001)

    @DisplayName("test greeter")
    @Test def testGreeter: Unit =
        val greeter = Greeter("Hi")
        val expected = "Hi, everyone!"
        val obtained = greeter.greet("everyone")
        assertEquals(expected, obtained)
