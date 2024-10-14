class Circle(var x: Int = 0, var y: Int = 0, var radius: Int = 1) : Movable, Transforming, Figure(0) {
    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }
    override fun area(): Float = (Math.PI * radius * radius).toFloat()

    override fun resize(zoom: Int) {
        radius *= zoom
    }
    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
    }
    override fun toString(): String = "Circle(x=$x, y=$y, radius=$radius)"
}
