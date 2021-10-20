import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
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

    f.add(jpanelSouth,BorderLayout.SOUTH)
    f.add(jpanelCenter,BorderLayout.CENTER)

    btnLogin.addActionListener{
        var username = txtFieldUsername.getText()
        var password = passwordField.getText()
        if(username.equals("Ghufran",true) && password == "123"){
            //Creating the second frame
            var secFrame = JFrame("Second Frame")
            secFrame.setSize(600,400)
            secFrame.setLocation(300,300)
            secFrame.layout=BorderLayout()

            //Components
            var outputArea = JTextArea()

            var inputTxtField = JTextField(30)

            var sendBtn = JButton("Send")

            var nameLabel = JLabel("${username.capitalize()} is writting: ")

            //Panels
            var southPanel = JPanel()
            southPanel.layout = FlowLayout()
            southPanel.add(inputTxtField)
            southPanel.add(sendBtn)

            var northPanel = JPanel()
            northPanel.layout = FlowLayout()
            northPanel.add(nameLabel)


            //Adding panels and textArea into the frame
            secFrame.add(southPanel, BorderLayout.SOUTH)
            secFrame.add(northPanel, BorderLayout.NORTH)
            secFrame.add(outputArea, BorderLayout.CENTER)

            //sendButton action
            sendBtn.addActionListener {
                outputArea.append(inputTxtField.getText()+"\n")
                inputTxtField.setText("")
            }


            secFrame.isVisible=true
        }
        else
            JOptionPane.showMessageDialog(f,"Login failed")

    }

    btnReset.addActionListener{
        txtFieldUsername.setText("")
        passwordField.setText("")
    }

    f.setSize(600,400)
    f.setLocation(300,300)
    f.isVisible=true

}