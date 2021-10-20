import java.awt.BorderLayout
import java.awt.Color
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextArea

fun main() {

    var FirstPage = JFrame(".. Chat ..")
    FirstPage.setBounds(300, 300, 600, 400)
    FirstPage.layout = BorderLayout()

    var writeAreaBox = JTextArea(3,30)
    var sendButton = JButton("Send")
    var showTextArea = JTextArea()

    FirstPage.add(showTextArea,BorderLayout.CENTER)

    var SouthPan =JPanel()
    SouthPan.background= Color(157, 132, 183)
    SouthPan.layout = FlowLayout()

    SouthPan.add(writeAreaBox)
    SouthPan.add(sendButton)

    FirstPage.add(SouthPan,BorderLayout.SOUTH)

    sendButton.addActionListener{
        var txt =writeAreaBox.text
        showTextArea.append("Guest: $txt\n")
        writeAreaBox.text=" "



    }

    FirstPage.isVisible = true

}