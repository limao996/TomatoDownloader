# 番茄小说下载器

```kotlin
fun main() = runBlocking {
    buildTomatoBook(
        book = TomatoBook(bookId),
        path = "./test.epub",
        isEpub = true,
    ) { msg, pos ->// 提示和进度
        println("$msg: $pos")
    }
}
```