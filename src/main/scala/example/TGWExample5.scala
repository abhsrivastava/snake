package example
import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample5 extends TurtleGraphicsWindow(400, 280) {
    val LINE_WIDTH=30
    val LINE_LENGTH=250
    val LINE_SPACING = 60
    val LINE_LEFT_X = -1 * LINE_LENGTH / 2
    val DASHED_LINE_HEIGHT = 2*LINE_SPACING + 2*LINE_WIDTH

    def drawLine(yCor: Int, typeLineCap: Int): Unit = {
        setpensize(LINE_WIDTH)
        setpencolor(GRAY)
        setlinecap(typeLineCap)
        pu()
        setxy(LINE_LEFT_X, yCor)
        pd()
        seth(EAST)
        forward(LINE_LENGTH)
    }
    
    def drawLines() : Unit = {
        drawLine(LINE_SPACING, LINECAP_BUTT)
        drawLine(0, LINECAP_ROUND)
        drawLine(-LINE_SPACING, LINECAP_SQUARE )
    }

    def drawDashedLines() : Unit = {
        setpensize(1)
        setpc(BLACK)
        setlinecap(LINECAP_BUTT)
        setPenPattern(3)
        pu()
        setxy( LINE_LEFT_X, -(DASHED_LINE_HEIGHT/2) )
        pd()
        seth(NORTH)
        forward(DASHED_LINE_HEIGHT)
        pu()
        setxy( LINE_LENGTH/2, -(DASHED_LINE_HEIGHT/2) )
        pd()
        forward(DASHED_LINE_HEIGHT)
    }

    def labelLines() : Unit = {
        setpc(WHITE)
        setlabelfont(SANS_SERIF_BOLD)
        setlabelheight(LINE_WIDTH/2)
        pu()
        val label1 = "BUTT"
        setxy( -(labelwidth(label1)/2), (LINE_SPACING - LINE_WIDTH/4) )
        label(label1)
        val label2 = "ROUND"
        setxy( -(labelwidth(label2)/2), -(LINE_WIDTH/4) )
        label(label2)
        val label3 = "SQUARE"
        setxy( -(labelwidth(label3)/2), (-LINE_SPACING - LINE_WIDTH/4) )
        label(label3)
    }
}

object TGWExample5 extends App {
    val me = new TGWExample5()
    me.home();
    me.clean();
    me.hideturtle();
    me.drawLines();
    me.labelLines();
    me.drawDashedLines();  
}