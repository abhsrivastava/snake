package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._

class TGWExample1 extends TurtleGraphicsWindow(600, 600)
{
    def box(sideSize : Int) : Unit = {
        1 to 4 foreach { _ => 
            forward(sideSize);
            right(90);
        }
    }

    def drawSomething() : Unit = {
        setpensize( 1 )
        home()
        setheading( NORTH )
        // draw 30 boxes while rotating the turtle around itself
        1 to 30 foreach { count => 
            box( 180 )
            right( 360/30 )    
        }
        penup()
        home()
        setheading( NORTH )
        // fill half of resulting triangles with ascending color numbers
        right( 1.5 )
        (1 to 32).foreach{ colorNumber => 
            forward( 90 )
            setpencolor( colorNumber )
            fill()
            home()
            right( 360/30 )   
        }
        home()
        setheading( NORTH )
        // fill other half with descending color numbers
        right( 1.5 + 360/60 )
        (32 to 1 by -1).foreach { colorNumber => 
            forward( 90 )
            setpencolor( colorNumber )
            fill()
            home()
            right( 360/30 )   
        }
   }
} 

object TGWExample1 extends App {
    val me = new TGWExample1()
    me.hideturtle()
    me.drawSomething()
}
