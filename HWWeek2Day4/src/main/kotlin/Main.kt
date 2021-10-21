import java.awt.BorderLayout
import java.awt.Color
import javax.swing.*

fun main() {
    var newFrame = JFrame("My New Application")
    newFrame.layout = BorderLayout()

    var send = JButton("Send")
    var jTextArea = JTextArea()
    jTextArea.isEditable = false
    var secTxtField = JTextField()
    send.addActionListener {
        jTextArea.text = "${jTextArea.text}\n${secTxtField.text}"
        secTxtField.text = ""
    }

    var secJPanel = JPanel()
    secJPanel.layout = BorderLayout()
    secJPanel.add(secTxtField, BorderLayout.CENTER)
    secJPanel.add(send, BorderLayout.EAST)

    newFrame.add(jTextArea)
    newFrame.add(secJPanel, BorderLayout.SOUTH)

    newFrame.setSize(500, 400)
    newFrame.setLocation(300, 200)
    newFrame.isVisible = true
}