package de.Jan.Captcha

import java.awt.Color
import java.awt.Font
import java.awt.FontMetrics
import java.awt.SystemColor.text
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO


class Captcha(destinationFile: File) {

    val solution: String
    val picture: File
    private val characters: Array<Char> = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', '-', '*', '!', '$', '&', '1', '2', '3', '3', '4', '5', '6', '7', '8', '9', '?', ')', '(', '§', '&', '/', '\\', '+', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')

    init {
        solution = randomString()
        val img: BufferedImage = ImageIO.read(Captcha::class.java.getResource("white.png"))
        val graphics = img.graphics
        graphics.font = Font("Arial", Font.ITALIC, 15)
        val metrics: FontMetrics = graphics.getFontMetrics(graphics.font)
        val x: Int = (img.width - metrics.stringWidth(solution)) / 2
        val y: Int = (img.height + metrics.height) / 2
        graphics.color = Color.BLACK
        graphics.drawString(solution, x, y)
        ImageIO.write(img, "png", destinationFile)
        picture = destinationFile
    }

    private fun randomString() : String {
        return characters.random().toString() + characters.random() + characters.random() + characters.random() + characters.random() + characters.random() + characters.random() + characters.random() + characters.random()
    }

}