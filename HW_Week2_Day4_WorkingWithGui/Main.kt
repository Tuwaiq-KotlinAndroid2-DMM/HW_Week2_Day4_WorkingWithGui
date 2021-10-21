import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    var f = JFrame("الدعم الفني")
    f.layout = BorderLayout()

    var btnLogin = JButton("تسجيل الدخول ")
    var btnReset = JButton("خروج")



    var labelUSername = JLabel("أكتب أسمك")
    labelUSername.setBounds(20, 100, 80, 20)
    var txtFieldUsername = JTextField(20)
    txtFieldUsername.setBounds(100, 100, 200, 20)



    var jpanelCenter = JPanel()
    jpanelCenter.layout = null
      jpanelCenter.add(labelUSername)
      jpanelCenter.add(txtFieldUsername)


    var jpanelSouth = JPanel()
    jpanelSouth.layout = FlowLayout()
    jpanelSouth.add(btnLogin)
    jpanelSouth.add(btnReset)


    f.add(jpanelSouth, BorderLayout.SOUTH)
    f.add(jpanelCenter, BorderLayout.CENTER)

    f.setSize(600, 400)
    f.setLocation(300, 300)
    f.isVisible = true




    btnLogin.addActionListener {
        var secFrame = JFrame("")
        secFrame.layout = BorderLayout()
        secFrame.setSize(400, 200)
        secFrame.setLocation(500, 500)


        var JA= JTextArea()

        secFrame.add(JA)

        var jpanel1 = JPanel()
        jpanel1.layout=FlowLayout()
        //JA.add(JA)

        var m=JTextField(20)
        m.setSize(250,200)
        jpanel1.add(m)



        var btnSend = JButton("Send")
        JA.setSize(400, 200)

        jpanel1.add(btnSend)

        btnSend.addActionListener {

            JA.append("${txtFieldUsername.text} : ${m.text}")
            m.text=""
            JA.append("\n")


        }

        secFrame.add(jpanel1,BorderLayout.SOUTH)

        secFrame.show()


    }


}