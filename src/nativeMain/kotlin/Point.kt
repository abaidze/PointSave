class Point(var x:String, var y:String) {

    override fun toString(): String = x + y

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (other !is Point) return false
        if (x != other.x || y != other.y) return false
        return true
    }


}