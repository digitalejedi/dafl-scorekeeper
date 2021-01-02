import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

object ProjectConstants {
    val APP_VERSION_NAME: String = "beta-" + DateTimeFormatter.ofPattern("yyyy.MM.dd").format(LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC))
    const val APP_VERSION_CODE = 1

}

object Dependencies {
    object AndroidX {
        const val NAVIGATION = "2.3.2"
        const val CONSTRAINTLAYOUT = "2.0.4"
        const val CORE_KTX = "1.3.2"
        const val APPCOMPAT = "1.2.0"
    }
    object ComGoogleAndroidMaterial {
        const val MATERIAL = "1.2.1"
    }
}
