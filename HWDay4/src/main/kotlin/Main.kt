import java.awt.*
import javax.swing.*

fun main() {

    // main Window
    var f = JFrame("My App")
    f.layout = BorderLayout()
    f.setSize(600, 400)
    f.setLocation(300, 300)

    // login and reset btn on main window (south)
    var btnLogin = JButton("Login")
    var btnReset = JButton("Reset")
//    var slider = JSlider(16,70)
//    slider.minimum = 16
//    slider.maximum = 70


    //username label and username text field
    var labelUSername = JLabel("Username")
    labelUSername.setBounds(20, 100, 80, 20)
    var txtFieldUsername = JTextField(20)
    txtFieldUsername.setBounds(100, 100, 200, 20)


    //password label and password field
    var labelPassword = JLabel("Password")
    labelPassword.setBounds(20, 160, 100, 20)
    var passwordField = JPasswordField(20)
    passwordField.setBounds(100, 160, 200, 20)

    //login btn is default
    f.rootPane.defaultButton = btnLogin

    //adding username and password to a centered panel
    var jpanelCenter = JPanel()
    jpanelCenter.layout = null
    jpanelCenter.add(labelUSername)
    jpanelCenter.add(txtFieldUsername)
    jpanelCenter.add(labelPassword)
    jpanelCenter.add(passwordField)

    //adding login and reset btns to south panel
    var jpanelSouth = JPanel()
    jpanelSouth.layout = FlowLayout()
    jpanelSouth.add(btnLogin)
    jpanelSouth.add(btnReset)

    //adding the two panels to the window
    f.add(jpanelSouth, BorderLayout.SOUTH)
    f.add(jpanelCenter, BorderLayout.CENTER)

    f.isVisible = true

    //btn reset = clears both username and password fields
    btnReset.addActionListener {
        txtFieldUsername.text = ""
        passwordField.text = ""
    }



    //making a second window
    var secFrame = JFrame("Second")
    secFrame.layout = BorderLayout()
    secFrame.setSize(600,400)
    secFrame.setLocation(300,300)

    //making a textarea to show messages
    var textArea = JTextArea()
    textArea.isEnabled = false
    textArea.foreground.red
    //creating a messagefield and a send btn
    var messageField = JTextField(20)
    messageField.setSize(250,200)
    var btnSend = JButton("Send")
    secFrame.rootPane.defaultButton = btnSend //send btn is default
    //creating a south panel to put message field and send btn in
    var downPanel = JPanel()
    downPanel.layout = FlowLayout()
    downPanel.add(messageField)
    downPanel.add(btnSend)
    //adding downpanel and textarea to second window
    secFrame.add(downPanel,BorderLayout.SOUTH)
    secFrame.add(textArea)

    //login btn action lisener (second window popup)
    btnLogin.addActionListener {
        secFrame.show()
    }

    //btn snd event -> sends messages from messageField to textarea. and clear the message field
    btnSend.addActionListener {
        var chat = messageField.text
        textArea.append("${txtFieldUsername.text}: $chat")
        messageField.text = ""
        textArea.append("\n")
    }

}