import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.JFrame
import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.JTextField

fun main() {
    var frame = JFrame("My app")
    frame.setSize(600,400)
    frame.setLocation(500,500)
    frame.layout=BorderLayout()

    var textfield = JTextField(20)
    var btnLogin = JButton("Login")
    var btnReset = JButton("Reset")
    var jpanelsouth = JPanel()
    jpanelsouth.layout=FlowLayout()
    jpanelsouth.add(textfield)
    jpanelsouth.add(btnLogin)
    jpanelsouth.add(btnReset)
    frame.add(jpanelsouth)

    frame.isVisible=true
}