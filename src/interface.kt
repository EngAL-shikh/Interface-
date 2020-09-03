interface  clicklisteners{

    fun click()
    fun longClick()
    fun doubleClick()
    fun rightClick()
}

interface secondclass:clicklisteners{

    fun sum()
    fun sub()
}
class teacher :secondclass{
    override fun sum() {
        TODO("Not yet implemented")
    }

    override fun sub() {
        TODO("Not yet implemented")
    }

    override fun click() {
        TODO("Not yet implemented")
    }

    override fun longClick() {
        TODO("Not yet implemented")
    }

    override fun doubleClick() {
        TODO("Not yet implemented")
    }

    override fun rightClick() {
        TODO("Not yet implemented")
    }


}
