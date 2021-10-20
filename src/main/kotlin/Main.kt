import java.awt.*
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import javax.swing.*

fun main() {
    secondFrame("sarah")
}

private fun secondFrame(userTextField: String) {
    var innerFrame = JFrame("Second frame")
    innerFrame.layout = BorderLayout()

    innerFrame.setSize(600, 400)
    innerFrame.setLocation(300, 300)

    var textArea = JTextArea()
    var textBox = JTextArea(3,25)
    var sendBtn = JButton("Send")

    sendBtn.addActionListener {
        sendMsg(textBox, textArea, userTextField)
    }

    textBox.addKeyListener(object: KeyListener{
        override fun keyTyped(e: KeyEvent?) {}
        override fun keyPressed(e: KeyEvent?) {
            if (e?.keyCode == 10 && e.isAltDown){
                textBox.text += "\n"
            } else if (e?.keyCode == 10){
                sendMsg(textBox, textArea, userTextField)
            }
        }
        override fun keyReleased(e: KeyEvent?) {}
    })

    var textInputPanel = JPanel()
    textInputPanel.layout = FlowLayout()
    textInputPanel.background = Color(170,170,170)
    textInputPanel.preferredSize = Dimension(innerFrame.width,innerFrame.height/6)

    textInputPanel.add(textBox)
    textInputPanel.add(sendBtn)

    innerFrame.add(textArea,BorderLayout.CENTER)
    innerFrame.add(textInputPanel, BorderLayout.SOUTH)

    innerFrame.isVisible = true
}

private fun sendMsg(textBox: JTextArea, textArea: JTextArea, userTextField: String) {
    var msg = textBox.text
    if (!msg.isEmpty() && msg != "\n") {
        textArea.append("$userTextField: $msg\n")
    } else {
        textArea.append("$userTextField: ^_^\n")
    }
    textBox.text = ""
}