// Using Libraries
import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {

    // Create Objects

    var frame = JFrame("My App")
    var btnSend = JButton("Send")
    var panel = JPanel()
    var txtfield = JTextField(50)
    var txtarea = JTextArea()

    // Using classes
    frame.layout = BorderLayout()
    panel.layout = FlowLayout()

    //Events
    btnSend.addActionListener {
        txtarea.text+="${txtfield.text}\n"
    }
    frame.add(txtarea)


    //Add Objects

    panel.add(txtfield)
    panel.add(btnSend)
    frame.add(panel,BorderLayout.SOUTH)

    //Set size and location

    frame.setSize(600,400)
    frame.setLocation(300,300)

    //Make it visible for user

    frame.isVisible = true

}