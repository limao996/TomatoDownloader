# 番茄小说下载器

## 示例

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

## 应用程序版本

[TomatoDownloader-App](https://github.com/limao996/TomatoDownloader-App)
