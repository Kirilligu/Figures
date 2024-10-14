class Square(var x: Int, var y: Int, var a: Int) : Movable, Transforming, Figure(0) {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float = (a * a).toFloat()

    override fun resize(zoom: Int) {
        a *= zoom
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val dx = x - centerX
        val dy = y - centerY
        when (direction) {
            RotateDirection.Clockwise -> move(dx, -dy)
            RotateDirection.CounterClockwise -> move(-dx, dy)
        }
    }

    override fun toString(): String = "Square(x=$x, y=$y, a=$a)"
}
