import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

fun main() {
    var f = JFrame("My App")
    f.layout = BorderLayout()

    var btnLogin = JButton("Login")
    var btnReset = JButton("Reset")



    var labelUSername = JLabel("Username")
    labelUSername.setBounds(20, 100, 80, 20)
    var txtFieldUsername = JTextField(20)
    txtFieldUsername.setBounds(100, 100, 200, 20)

    var labelPassword = JLabel("Password")
    labelPassword.setBounds(20, 160, 100, 20)
    var passwordField = JPasswordField(20)
    passwordField.setBounds(100, 160, 200, 20)

    var label = JLabel("Welcom")
    label.setBounds(20, 190, 120, 20)


    var jpanelCenter = JPanel()
    jpanelCenter.layout = null
    jpanelCenter.add(labelUSername)
    jpanelCenter.add(txtFieldUsername)
    jpanelCenter.add(labelPassword)
    jpanelCenter.add(passwordField)


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

//*************
        var JA= JTextArea()

        secFrame.add(JA)

        var jpanel1 = JPanel()
        jpanel1.layout=FlowLayout()
        //JA.add(JA)

        var m=JTextField(20)
        m.setSize(250,200)
        jpanel1.add(m)



//**************
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
