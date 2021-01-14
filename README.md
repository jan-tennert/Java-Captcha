# Java-Captcha

A small package to generate Captcha Images.

# Installation

```xml
<repository>
	<id>jitpack.io</id>
	<url>https://jitpack.io</url>
</repository>
```
```xml
<dependency>
    <groupId>com.github.jan-tennert</groupId>
    <artifactId>Java-Captcha</artifactId>
    <version>9d2b4426a5</version>
</dependency>
```

# Demo
##### Kotlin

```kotlin
val captchaClient = CaptchaClient()
val captcha = captchaClient.generateCaptcha(File(""))
println(captcha.solution)
println(captcha.picture.absolutePath)
```

##### Java

```java
CaptchaClient captchaClient = new CaptchaClient()
Captcha captcha = captchaClient.generateCaptcha(new File(""))
System.out.println(captcha.getSolution())
System.out.println(captcha.getPicture().getAbsolutePath())
```
