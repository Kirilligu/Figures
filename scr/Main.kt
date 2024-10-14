fun main() {
    val figures: Array<Movable> = arrayOf(
        Rect(0, 0, 1, 1),
        Rect(4, 3, 4, 2),
        Circle()
    )
    figures[0].move(1, 1)
    val rect = figures[1] as Rect
    println("Area of Rect: ${rect.area()}")
    println("Area of Circle: ${(figures[2] as Circle).area()}")
    println("Initial Rect: $rect")
    repeat(3) {
        rect.rotate(RotateDirection.Clockwise, 3, -3)
        println("After clockwise rotate: $rect")
    }
    rect.rotate(RotateDirection.CounterClockwise, 3, -3)
    println("After counterclockwise rotate: $rect")
}
