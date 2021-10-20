import java.awt.BorderLayout
import java.awt.Color
import javax.swing.*

fun main() {

    var f=JFrame("MY APP")
    f.layout=BorderLayout()

    var color=JColorChooser(Color.RED)
    f.add(color)



    var t=JTextArea("Massage")
    t.setBounds(200,200,100,130)

    f.add(t)

    var t2=JTextField("hello")
    t2.setBounds(20,40,90,90)
    f.add(t2)

    var send=JButton("send massage")
    send.setBounds(70,40,120,120)
    send.addActionListener { t }
    f.add(send)






    f.setSize(600,400)
    f.setLocation(300,300)
    f.isVisible=true

}