package repl

import org.jline.reader.LineReader
import org.jline.reader.LineReaderBuilder
import org.jline.reader.EndOfFileException
import org.jline.reader.UserInterruptException

import hello.Greeter

object repl:
    def main(args: Array[String]): Unit =
        val greeter = Greeter("Hello")
        println(greeter.greet("REPL"))
        val reader = LineReaderBuilder.builder().build()
        val prompt = ">> "
        while (true)
            var line: String = null
            try line = reader.readLine(prompt)
            catch
                case e: UserInterruptException => return;
                case e: EndOfFileException     => return;
            if (line != null && line != "")
                println(s"line=${line}")
