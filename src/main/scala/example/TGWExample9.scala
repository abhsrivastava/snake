package example

import com.turtle.TurtleGraphicsWindow
import com.turtle.TurtleGraphicsWindow._
import com.turtle.TGPoint

class TGWExample9 extends TurtleGraphicsWindow(655, 675) {
    val random = new scala.util.Random()
    val PASTELS : Array[Int] = Array(WHITE, GRAY, WHEAT, PALEGREEN, LIGHTBLUE, KHAKI, PINK)

    def drawCircle(point: TGPoint, radius: Double) : Unit = {
        pu()
        setpos(point)
        pd()
        arc(360, radius)
    }

    def getRandomColor(arr: Array[Int]) : Int = {
        val rand = random.nextInt(arr.size)
        arr(rand)
    }

    def fillCircle(point: TGPoint, color: Int, radius: Double) : Unit = {
        setpc(BLACK)
        drawCircle(point, radius)
        pu()
        setpos(point)
        setpencolor(color)
        fill()
    }

    def drawCirclesInCircle(level: Int, point: TGPoint, radius: Double) : Unit = {
        def fiftyEightPercent(num: Double) : Double = .58 * num
        def fortyOnePercent(num: Double) : Double = .41 * num
        fillCircle(point, getRandomColor(PASTELS), radius)
        if (level > 1) {
            drawCirclesInCircle( level-1, new TGPoint(point.x, point.y+fiftyEightPercent(radius)), fortyOnePercent(radius))
            drawCirclesInCircle( level-1, new TGPoint(point.x+fiftyEightPercent(radius), point.y), fortyOnePercent(radius))
            drawCirclesInCircle( level-1, new TGPoint(point.x, point.y-fiftyEightPercent(radius)), fortyOnePercent(radius))
            drawCirclesInCircle( level-1, new TGPoint(point.x-fiftyEightPercent(radius), point.y), fortyOnePercent(radius))
        }
    }
}

object TGWExample9 extends App {
    val me = new TGWExample9()
    me.clean()
    me.ht()
    me.setpensize( 1 )
    me.drawCirclesInCircle( 6, new TGPoint(0,0), 300)
}