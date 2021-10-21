import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.*

fun main() {
    var f= JFrame("My App")
    f.layout=BorderLayout()

    var btnLogin = JButton("Login")
    var btnReset = JButton("Reset")
    var label = JLabel()

    var s = JSlider(12,100)
    s.setSize(200,20)
    s.setLocation(100,50)
    f.add(s)



    var l = JLabel("Font Size")
    l.setSize(150,50)
    l.setLocation(40,30)
    f.add(l)


    var labelUSername=JLabel("Username")
    labelUSername.setBounds(20,100,80,20)
    var txtFieldUsername=JTextField(20)
    txtFieldUsername.setBounds(100,100,200,20)

    var labelPassword=JLabel("Password")
    labelPassword.setBounds(20,160,100,20)
    var passwordField=JPasswordField(20)
    passwordField.setBounds(100,160,200,20)


    var jpanelCenter=JPanel()
    jpanelCenter.layout=null
    jpanelCenter.add(labelUSername)
    jpanelCenter.add(txtFieldUsername)
    jpanelCenter.add(labelPassword)
    jpanelCenter.add(passwordField)

    var jpanelSouth=JPanel()
    jpanelSouth.layout=FlowLayout()
    jpanelSouth.add(btnLogin)
    jpanelSouth.add(btnReset)

    f.add(jpanelSouth,BorderLayout.SOUTH)
    f.add(jpanelCenter,BorderLayout.CENTER)

    f.setSize(600,400)
    f.setLocation(300,300)
    f.isVisible=true

    btnLogin.addActionListener {
        var username = txtFieldUsername.text
        var password=passwordField.text

        if(username.equals("admin") && password.equals("123")){
            JOptionPane.showMessageDialog(f,"Login success")
        }else{
            JOptionPane.showMessageDialog(f,"Login Failed")
        }
    }
    btnReset.addActionListener {
        txtFieldUsername.text=""
        passwordField.text=""
    }

    s.addChangeListener {
        var fontSize = s.value
        l.font=Font("", Font.PLAIN,fontSize)
    }

    btnLogin.addActionListener{
        var newWindow = JFrame("Second")
        newWindow.layout=BorderLayout()

        newWindow.setSize(400,200)
        newWindow.setLocation(500,500)


        var newWindowtxtArea=JTextArea()
        newWindow.add(newWindowtxtArea)


        var jpanelSouth=JPanel()
        jpanelSouth.setSize(500,220)
        jpanelSouth.layout=FlowLayout()

        var message = JTextField(20)
        message.setSize(250,220)
        jpanelSouth.add(message)


        var btnSend = JButton("Send")
        btnSend.setSize(400,200)
        jpanelSouth.add(btnSend)


        btnSend.addActionListener {
            newWindowtxtArea.append("${txtFieldUsername.text}: ${message.text} ")
            message.text=""
            newWindowtxtArea.append("\n")
        }

        newWindow.add(jpanelSouth,BorderLayout.SOUTH)
        newWindow.show()


    }


}