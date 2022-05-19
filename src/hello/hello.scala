package hello


def breakpoint(): Unit = println("breakpoint!")


object hello:
    def main(args: Array[String]) =
        // args.foreach(println)
        for (arg, i) <- args.zipWithIndex do
            println(s"arg[${i}]=$arg")
        val g = Greeter("Hello")
        println(g.greet("world"))
        val x = 1
        var y = 2
        breakpoint()
        println(s"x+y=${x+y}")


class Greeter(val greeting: String):
    def greet(name: String): String =
        s"${greeting}, ${name}!"