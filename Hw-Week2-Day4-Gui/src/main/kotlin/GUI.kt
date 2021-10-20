import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {




    var frame = JFrame("My App")
    frame.layout= BorderLayout()


    var OutputMessage = JTextArea("Hello")
    var InputMessage = JTextField(30)
    var SendButton = JButton("Send")

    var SouthPanel = JPanel()
    SouthPanel.layout= FlowLayout()
    SouthPanel.add(InputMessage)
    SouthPanel.add(SendButton)

    frame.add(SouthPanel,BorderLayout.SOUTH)
    frame.add(OutputMessage,BorderLayout.CENTER)

    SendButton.addActionListener {
        OutputMessage.text +=" ${InputMessage.text}\n"
    }

    frame.setSize(600,400)
    frame.setLocation(300,300)
    frame.isVisible = true







}