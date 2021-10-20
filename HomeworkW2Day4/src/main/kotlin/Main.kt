import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main(args: Array<String>) {

    var frame= JFrame("My App")
    frame.layout= BorderLayout()

    var SendBtn=JButton("Send")
    var field=JTextField(50)

    var area=JTextArea()

    SendBtn.addActionListener {

        area.text=field.text

    }

    frame.add(area)

    var SouthPanel=JPanel()
    SouthPanel.layout=null
    SouthPanel.layout=FlowLayout()
    SouthPanel.add(SendBtn)
    SouthPanel.add(field)
    frame.add(SouthPanel,BorderLayout.SOUTH)


    frame.setSize(600,400)
    frame.setLocation(300,300)


    frame.isVisible=true



}
