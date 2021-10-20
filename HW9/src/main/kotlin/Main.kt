import java.awt.BorderLayout
import java.awt.Color
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    var fram=JFrame("my app")
    fram.setBounds(300,200,700,500)
    fram.layout=BorderLayout()

    var textArea=JTextArea()
    textArea.setBounds(0,10,700,400)


    var textField=JTextField(30)

    var sendButton=JButton("Send")


    var jpaneCenter=JPanel()
    jpaneCenter.layout=null
    jpaneCenter.add(textArea)

    var japaneSouth=JPanel()
    japaneSouth.layout=FlowLayout()
    japaneSouth.add(textField)
    japaneSouth.add(sendButton)

    fram.add(japaneSouth,BorderLayout.SOUTH)
    fram.add(jpaneCenter, BorderLayout.CENTER)

    sendButton.addActionListener {
        textArea.text+="${textField.text}\n"
    }

    fram.isVisible=true

}