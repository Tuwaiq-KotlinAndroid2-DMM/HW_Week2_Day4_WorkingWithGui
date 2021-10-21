import org.w3c.dom.Text
import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Label
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

    var label = JLabel()


    btnLogin.addActionListener {
        var secFrame = JFrame("second")
        secFrame.setSize(600, 400)
        secFrame.setLocation(300, 300)
        secFrame.layout = BorderLayout()
        label.text = "Welcome ${txtFieldUsername.text}"


        secFrame.add(label)
        //label.
        secFrame.show()
    }



    f.add(jpanelSouth, BorderLayout.SOUTH)
    f.add(jpanelCenter, BorderLayout.CENTER)
    f.setSize(600, 400)
    f.setLocation(300, 300)
    f.isVisible = true

//    btnLogin.addActionListener {
////    JOptionPane.showMessageDialog("welcome to event")
////    JOptionPane.showMessageDialog(f,"Welcome ")
//        var username = txtFieldUsername.text
//        var pass = passwordField.text
//
//        if (username.equals("beba") && pass.equals("123")) {
//            JOptionPane.showMessageDialog(f, "Logged")
//        } else {
//            JOptionPane.showMessageDialog(f, "not Logged")
//
//        }
//
//    }
    btnReset.addActionListener {
        txtFieldUsername.text = ""
        passwordField.text = ""

    }


        var nf= JFrame("My App")

        nf.layout = BorderLayout()

        nf.setSize(600,400)
        nf.setLocation(300,300)

        var btnsend= JButton("send ")
        var output= JTextField()
        var inter= JTextArea(2,30)
        var showTextArea = JTextArea()


        var south= JPanel()
        south.add(inter)
        south.add(btnsend)
        f.add(south,BorderLayout.SOUTH)

        btnsend.addActionListener {
            var txt =inter.text
            showTextArea.append("Guest: $txt\n")
            inter.text=" "
        }


nf.isVisible = true










}


