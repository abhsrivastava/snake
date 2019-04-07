package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample6 extends TurtleGraphicsWindow(300, 300) {
    def drawSquiral() : Unit = {
        5 to 200 by 5 foreach{ steps =>
            forward(steps)
            right(90)
        }
    }
}

object TGWExample6 extends App {
    val me = new TGWExample6()
    me.ht()
    me.home()
    me.drawSquiral()
    
}