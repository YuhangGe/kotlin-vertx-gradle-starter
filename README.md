# kotlin-vertx-gradle-starter

[kotlin](https://kotlinlang.org) + [vert.x](http://vertx.io) + [gradle](https://gradle.org) 项目初始框架

## no-vertx

no-vertx 分支不包含 vert.x，是最简单的 kotlin + gradle 的 hello-world 项目。

需要注意的是目录结构一定要是 `src/main/kotlin`，
代码一定要放在 `kotlin` 目录下，因为 gradle 的插件默认就是这样的，这样才能被 idea 识别和正常运行。
和 `kotlin` 目录同级的可以有其他诸如 `java`, `groovy` 等语言目录。

## master

master 分支包含 vert.x，并且有 java 和 kotlin 代码混用的例子，如果不需要 java 代码，
将 `src/main/java` 目录删除即可。

