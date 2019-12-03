package Util

class DisplayFormatter {
    companion object {
        fun title(title: String) {
            val length = title.length

            repeatChar('=', length)
            println(title)
            repeatChar('=', length)
            println()
        } // title

        fun subTitle(subTitle: String) {
            println(subTitle)
            repeatChar('-', subTitle.length)
            println()
        } // subTitle

        fun answer(answer: Any) {
            println("Answer:\n  $answer")
            println()
        } // answer

        private fun repeatChar(char: Char, n: Int) {
            for (i in 1..n) {
                print(char)
            } // for
            println()
        } // repeatChar

    }
} // Util.DisplayFormatter