import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    var f= JFrame("My App")
    f.layout= BorderLayout()
    var btnSend=JButton("Send")
    var jtxtarea= JTextArea()
    var txtField=JTextField(50)
    btnSend.addActionListener {
        jtxtarea.text+="${txtField.text}\n"
    }
    f.setSize(600,400)
    f.setLocation(300,300)

    var jpanelSouth=JPanel()
    jpanelSouth.layout=FlowLayout()
    jpanelSouth.add(txtField)
    jpanelSouth.add(btnSend)

    f.add(jpanelSouth,BorderLayout.SOUTH)
f.add(jtxtarea)
    f.isVisible=true
}