package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample3 extends TurtleGraphicsWindow(600, 600) {
    def drawScene() : Unit = {
        if (!loadpicture( "Clouds.jpg" )) {
            println("failed to load picture")
        }
        if(!loadshape( "Parrot.png", FIRST_USER_SUPPLIED_SHAPE )) {
           println( "loadshape() failed" );
        }
        if(!setshape( FIRST_USER_SUPPLIED_SHAPE )) {
           println( "setshape() failed" )
        }
    }
}

object TGWExample3 extends App {
    val me = new TGWExample3()
    me.drawScene()
}