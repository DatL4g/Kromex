package utils

import kotlinx.serialization.json.Json
import org.cuongnv.consoleformatter.ConsoleColors
import java.io.File

object Constants {
    val json = Json {
        prettyPrint = true
        isLenient = true
        ignoreUnknownKeys = true
    }

    val outputDir = File("./../base/src/main/kotlin/")

    const val KROMEX =
            "${ConsoleColors.RED_BOLD} __  __${ConsoleColors.RESET}                                  \n" +

            "${ConsoleColors.RED_BOLD}|  |/  |${ConsoleColors.RESET}" +
            "${ConsoleColors.PURPLE_BOLD}.––––.${ConsoleColors.RESET}" +
            "${ConsoleColors.BLUE_BOLD}–––––.${ConsoleColors.RESET}" +
            "${ConsoleColors.CYAN_BOLD}––––––––.${ConsoleColors.RESET}" +
            "${ConsoleColors.GREEN_BOLD}–––––.${ConsoleColors.RESET}" +
            "${ConsoleColors.YELLOW_BOLD}––.––.${ConsoleColors.RESET}\n" +

            "${ConsoleColors.RED_BOLD}|     <${ConsoleColors.RESET}" +
            "${ConsoleColors.PURPLE_BOLD} |   _|${ConsoleColors.RESET}" +
            "${ConsoleColors.BLUE_BOLD}  _  |${ConsoleColors.RESET}" +
            "${ConsoleColors.CYAN_BOLD}        |${ConsoleColors.RESET}" +
            "${ConsoleColors.GREEN_BOLD}  -__|${ConsoleColors.RESET}" +
            "${ConsoleColors.YELLOW_BOLD}_   _|${ConsoleColors.RESET}\n" +

            "${ConsoleColors.RED_BOLD}|__|\\__|${ConsoleColors.RESET}" +
            "${ConsoleColors.PURPLE_BOLD}|__|${ConsoleColors.RESET}" +
            "${ConsoleColors.BLUE_BOLD} |_____|${ConsoleColors.RESET}" +
            "${ConsoleColors.CYAN_BOLD}__|__|__|${ConsoleColors.RESET}" +
            "${ConsoleColors.GREEN_BOLD}_____|${ConsoleColors.RESET}" +
            "${ConsoleColors.YELLOW_BOLD}__.__|${ConsoleColors.RESET}"

    const val DESCRIPTION =
        "${ConsoleColors.RED}Kromex is${ConsoleColors.RESET}" +
                "${ConsoleColors.PURPLE} a Free${ConsoleColors.RESET}" +
                "${ConsoleColors.BLUE} and Open${ConsoleColors.RESET}" +
                "${ConsoleColors.CYAN} Source extension${ConsoleColors.RESET}" +
                "${ConsoleColors.GREEN} template written${ConsoleColors.RESET}" +
                "${ConsoleColors.YELLOW} in Kotlin${ConsoleColors.RESET}"
}