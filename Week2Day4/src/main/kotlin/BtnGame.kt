import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.util.*
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JSlider
import javax.swing.*

fun main() {
    var f = JFrame("My App")
    f.layout = null

    var btn = JButton("Click me!")
    btn.setBounds(100,100,100,100)

    class myListener : MouseListener {
        override fun mouseClicked(e: MouseEvent?) {
        }
        override fun mousePressed(e: MouseEvent?) {
        }
        override fun mouseReleased(e: MouseEvent?) {
        }

        override fun mouseEntered(e: MouseEvent?) {
            var r = Random()
            var x = r.nextInt(600)
            var y = r.nextInt(400)
            btn.setLocation(x,y)
        }

        override fun mouseExited(e: MouseEvent?) {
        }
    }

    //btn.addMouseListener(myListener())
   // btn.addMouseListener(object : ActionListener {
   //     override fun actionPerformed(e: ActionEvent?) {

   //     }
    //}


    f.add(btn)
    f.setSize(600,400)
    f.setLocation(300,300)
    f.isVisible = true
}