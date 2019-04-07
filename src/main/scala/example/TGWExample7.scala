package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample7 extends TurtleGraphicsWindow(300, 300) {
    def pointOut100() : Unit = {
        setpensize(30)
        pu()
        forward(85)
        pd()
        forward(30)
        pu()
        back(115)
    }

    def drawCircle() : Unit = {
        1 to 18 foreach{_ => 
            pointOut100()
            right(20)
        }
    }
}

object TGWExample7 extends App {
    val me = new TGWExample7()
    me.ht()
    me.drawCircle()

}
