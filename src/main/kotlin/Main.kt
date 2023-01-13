import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    val a = nextInt();
    val b = nextInt();

    print((2 * b) - a)



    fun sum(a: Int, b: Int): Int{
        return a + b;
    }
    print(sum(a, b))



    println("")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}