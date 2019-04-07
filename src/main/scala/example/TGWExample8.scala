package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample8 extends TurtleGraphicsWindow(500, 320) {
    val LINE_LENGTH = 400
    val LINE_LEFT_X = -1 * LINE_LENGTH / 2
    val LINE_SPACING = 70
    val LINE_WIDTH = 30

    def drawLine(yCor: Int, segLength : Int) : Unit = {
        setpensize(LINE_WIDTH)
        setpc(LIGHTGRAY)
        setPenPattern(segLength)
        pu()
        setxy(LINE_LEFT_X, yCor)
        pd()
        seth(EAST)
        forward(LINE_LENGTH)
        setpensize(2)
        setpc(BLACK)
        pu()
        setxy(LINE_LEFT_X, yCor)
        pd()
        forward(LINE_LENGTH)
    }

    def drawLine(yCor: Int, pattern: Array[Int]) : Unit = {
        setpensize(LINE_WIDTH)
        setpc(LIGHTGRAY)
        setPenPattern(pattern)
        pu()
        setxy(LINE_LEFT_X, yCor)
        pd()
        seth(EAST)
        forward(LINE_LENGTH)
        setpensize(2)
        setpc(BLACK)
        pu()
        setxy(LINE_LEFT_X, yCor)
        pd()
        forward(LINE_LENGTH)
    }

    def drawLines() : Unit = {
        drawLine(LINE_SPACING, 3)
        drawLine( 0, Array(40, 10) )
        drawLine( -LINE_SPACING, Array(40, 5, 10, 5))
    }

    def drawLabels() : Unit = {
        setpc(BLACK)
        setlabelfont(SANS_SERIF_BOLD)
        setlabelheight(LINE_WIDTH / 3)
        pu()
        val label1 = "setPenPattern(3)"
        setxy( -(labelwidth(label1)/2), (LINE_SPACING - LINE_SPACING/2) )
        label(label1)
        pu()
        val label2 = "setPenPattern(Array(40, 10))"
        setxy( -(labelwidth(label2)/2), -(LINE_SPACING/2) )
        label(label2)
        pu()
        val label3 = "setPenPattern(Array(40, 5, 10, 5))"
        setxy( -(labelwidth(label3)/2), (-LINE_SPACING - LINE_SPACING/2) )
        label(label3)
    }
}

object TGWExample8 extends App {
    val me = new TGWExample8()
    me.clean()
    me.home()
    me.ht()
    me.drawLines()
    me.drawLabels()
}