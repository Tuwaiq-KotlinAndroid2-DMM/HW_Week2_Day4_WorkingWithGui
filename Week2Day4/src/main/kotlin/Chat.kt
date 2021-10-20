import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JSlider
import javax.swing.*

fun main() {
    var frame = JFrame("Second")
    frame.setSize(600,400)
    frame.setLocation(300,300)
    frame.layout= BorderLayout()

    var btnSend = JButton("Send")
    var txtField= JTextField(20)
    txtField.setBounds(100,100,200,20)

    var txtArea = JTextArea()
    txtArea.setSize(500,300)
    var jpanelCenter=JPanel()
    jpanelCenter.layout=null
    jpanelCenter.add(txtArea)

    var jpanelSouth=JPanel()
    jpanelSouth.layout=FlowLayout()
    jpanelSouth.add(txtField)
    jpanelSouth.add(btnSend)

    btnSend.addActionListener {
        txtArea.text = txtField.text

    }


    frame.add(jpanelSouth,BorderLayout.SOUTH)
    frame.add(jpanelCenter,BorderLayout.CENTER)

    frame.isVisible=true
}