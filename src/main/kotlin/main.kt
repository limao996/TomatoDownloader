import kotlinx.coroutines.runBlocking
import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("输入要下载的书籍ID: ")
    val bookId = reader.next()
    print("是否启用Epub模式 (Y/n): ")
    val isEpub = reader.next().contains('y', true)
    println("Epub: $isEpub")
    runBlocking {
        val book = TomatoBook(bookId)
        buildTomatoBook(book, "./${book.name}." + (if (isEpub) "epub" else "txt"), isEpub) { msg, pos ->
            print("$msg ")
            println((pos * 100).toInt())
        }
    }
}