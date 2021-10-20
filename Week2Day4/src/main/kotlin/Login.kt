import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.event.ActionListener
import javax.swing.*

fun main() {
    var f= JFrame("My App")
    f.layout=BorderLayout()

    var btnLogin = JButton("Login")
    var btnReset = JButton("Reset")


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
    btnLogin.addActionListener{
        //JOptionPane.showMessageDialog(f,"Welcome to action")
        var username = txtFieldUsername.text
        var password = passwordField.text

        if (username.equals("Ali") && password.equals("123")){
            JOptionPane.showMessageDialog(f,"Authorized")
        }else{
            JOptionPane.showMessageDialog(f,"Unauthorized")
        }
    }
    btnReset.addActionListener{
        txtFieldUsername.text = ""
        passwordField.text = ""

    }
    f.add(jpanelSouth,BorderLayout.SOUTH)
    f.add(jpanelCenter,BorderLayout.CENTER)

    f.setSize(600,400)
    f.setLocation(300,300)
    f.isVisible=true



}