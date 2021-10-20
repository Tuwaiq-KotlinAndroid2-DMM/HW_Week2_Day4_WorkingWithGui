import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    var f = JFrame("MY APP")
    f.layout = BorderLayout()
    var textArea = JTextArea()
    var btn = JButton("Send")
    var textField = JTextField(50)
    btn.addActionListener {
        textArea.text+="${textField.text}\n"
    }
f.add(textArea)


    var jpanelSouth = JPanel()
    jpanelSouth.layout = FlowLayout()
    jpanelSouth.add(textField)
    jpanelSouth.add(btn)


    f.add(jpanelSouth, BorderLayout.SOUTH)


    f.setSize(600, 400)
    f.setLocation(300, 300)
    f.isVisible = true

}
