import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {

    var Frame = JFrame("My App")
    Frame.layout = BorderLayout()


    Frame.setSize(600, 400)
    Frame.setLocation(300, 300)


    
    var btnSend = JButton("Send")
    var out = JTextField()
    var inter = JTextArea(2, 30)



    btnSend.addActionListener {
        out.text += " ${inter.text}\n"
    }


    var jPanelSouth = JPanel()
    jPanelSouth.layout = FlowLayout()


    jPanelSouth.add(inter)
    jPanelSouth.add(btnSend)
    Frame.add(out, BorderLayout.CENTER)
    Frame.add(jPanelSouth, BorderLayout.SOUTH)
    Frame.add(out, BorderLayout.CENTER)


    Frame.isVisible = true
}