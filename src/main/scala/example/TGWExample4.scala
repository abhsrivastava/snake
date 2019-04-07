package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample4 extends TurtleGraphicsWindow(600, 600) {
    def drawArcs() : Unit = {
        pu()
        setxy(-100, -100)
        setpensize(1)
        setpc(BLACK)
        setheading(NORTH)
        pd()
        1 to 4 foreach{ _ =>
            forward(200)
            right(90)
        }
        pu()
        home()
        pd()
        drawArc(NORTH, 40, YELLOW, 90, 100)
        drawArc(EAST, 30, ORANGE, 90, 100)
        drawArc(SOUTH, 20, CHOCOLATE, 90, 100)
        drawArc(WEST, 10, BROWN, 90, 100)
        setpensize(1)
        setpc(BLACK)
        arc(360, 100)
    }
    def drawArc(direction: Int, pensize: Int, color: Int, arcx: Int, arcy: Int) : Unit = {
        seth(direction)
        setpensize(pensize)
        setpc(color)
        arc(arcx, arcy)
    }
}

object TGWExample4 extends App {
    val me = new TGWExample4()
    me.home()
    me.clean()
    me.hideturtle()
    me.drawArcs()
}