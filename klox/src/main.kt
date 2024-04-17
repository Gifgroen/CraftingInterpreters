import java.io.File
import java.util.Scanner // TODO: replace with our own 'lexer' Scanner

private fun run(source: String) {
    val scanner = Scanner(source)
    val tokens = scanner.tokens()

    // For now, just print the tokens.
    for (token in tokens) {
      println(token)
    }
}

fun runFile(filename: String) {
    val file = File(filename)
    val lines = file.readLines()
    val source = lines.joinToString("\n")
    run(source)
}

fun runPrompt() {
    while(true) {
      print("> ");
      val line = readLine()
      if (line == null) {
        break;
      }
      run(line);
    }
}

fun main(args: Array<String>) {
    if (args.size > 1) {
        println("Usage: ./klox [script]")
        System.exit(64)
    }
    if (args.size == 1) {
        val filename = args.first()
        runFile(filename)
        System.exit(0)
    }

    runPrompt()
    System.exit(0)
}
