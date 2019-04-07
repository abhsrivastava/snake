package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._
import com.turtle.TGKeyHandler


class TGWExample2 extends TurtleGraphicsWindow(600, 600) {
    override def tgKeyReleased(keyNum: Int) : Unit = keyNum match {
        case TGKeyHandler.DOWN_ARROW => 
            back(5)
        case TGKeyHandler.UP_ARROW => 
            forward(5)
        case TGKeyHandler.LEFT_ARROW => 
            left(5)
        case TGKeyHandler.RIGHT_ARROW => 
            right(5)
    }

    override def tgKeyTyped(keyChar: Char) : Unit = keyChar match {
        case 'd' => 
            setpc(BLACK)
            pd()
        case 'u' => 
            setpc(WHITE)
            pu()
    }

    override def tgMouseClicked(x: Int, y: Int) : Unit = {
        println(s"tgMouseClicked($x, $y)")
        setxy(x, y)
    }
}

object TGWExample2 extends App {
    val me = new TGWExample2()
    me.setpensize( 8 )
    me.setshape( ARROW )
}