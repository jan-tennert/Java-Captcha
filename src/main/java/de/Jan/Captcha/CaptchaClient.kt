package de.Jan.Captcha

import java.io.File

class CaptchaClient {

    fun generateCaptcha(destinationFile: File) : Captcha {
        return Captcha(destinationFile)
    }

}