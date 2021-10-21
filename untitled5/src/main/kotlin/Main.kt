


import java.awt.BorderLayout
import java.awt.EventQueue
import java.awt.GridLayout
import java.awt.Panel
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.*
import javax.swing.border.TitledBorder
var area:JTextArea = JTextArea()
var msgField:JTextField = JTextField(8)
var sendBtn :JButton = JButton("Send")
class Chat(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(300, 200)

        var panel:JPanel  = JPanel()
        //  panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login", TitledBorder.LEFT, TitledBorder.TOP))
        var panel2 = JPanel()
        panel2.add(area)


        var panel3 = JPanel()
        sendBtn.addActionListener(HandleSend());
        panel3.add(msgField)

        panel3.add(sendBtn)

        panel.layout=BorderLayout()

        panel.add(panel2 , BorderLayout.CENTER)
        panel.add(panel3 , BorderLayout.PAGE_END)



        add(panel)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {

    val frame = Chat("Massenger")
    frame.isVisible = true
}

//handle send button click with HandleSend class
class HandleSend : ActionListener{
    override fun actionPerformed(e: ActionEvent?) {
        area.text =  area.text+msgField.text + "\n"

        msgField.text=""
    }


}
fun main() {
    EventQueue.invokeLater(::createAndShowGUI)
}