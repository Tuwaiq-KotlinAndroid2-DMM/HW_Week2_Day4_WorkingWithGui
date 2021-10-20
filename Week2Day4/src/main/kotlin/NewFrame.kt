import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JSlider
import javax.swing.*

fun main() {
        var f= JFrame("My App")
        f.layout= BorderLayout()

        //Creating two buttons
        var btnLogin = JButton("Login")
        var btnReset = JButton("Reset")

        // Username label and text field
        var labelUSername= JLabel("Username")
        labelUSername.setBounds(20,100,80,20)
        var txtFieldUsername= JTextField(20)
        txtFieldUsername.setBounds(100,100,200,20)

        // Password label and text field
        var labelPassword= JLabel("Password")
        labelPassword.setBounds(20,160,100,20)
        var passwordField= JPasswordField(20)
        passwordField.setBounds(100,160,200,20)
        //center panel for the username and password labels and fields
        var jpanelCenter= JPanel()
        jpanelCenter.layout=null
        jpanelCenter.add(labelUSername)
        jpanelCenter.add(txtFieldUsername)
        jpanelCenter.add(labelPassword)
        jpanelCenter.add(passwordField)
        //south panel for the buttons
        var jpanelSouth= JPanel()
        jpanelSouth.layout= FlowLayout()
        jpanelSouth.add(btnLogin)
        jpanelSouth.add(btnReset)
        btnLogin.addActionListener{
            //New frame
            var secFrame = JFrame("Second")
            secFrame.setSize(600,400)
            secFrame.setLocation(300,300)
                var username = txtFieldUsername.text
                var password = passwordField.text
                // Check if the user's information are correct
                if (username.equals("Ali") && password.equals("123")){
                    // Showing the frame
                        secFrame.show()
                    var frame = JFrame("Second")
                    frame.setSize(600,400)
                    frame.setLocation(300,300)
                    frame.layout= BorderLayout()

                    var btnSend = JButton("Send")
                    // Creating a text field to write a message
                    var txtField= JTextField(20)
                    txtField.setBounds(100,100,200,20)
                    // Creating a text area to show the message
                    var txtArea = JTextArea()
                    txtArea.setSize(500,300)
                    //Adding to the center panel
                    var jpanelCenter=JPanel()
                    jpanelCenter.layout=null
                    jpanelCenter.add(txtArea)
                    //Adding to the south panel
                    var jpanelSouth=JPanel()
                    jpanelSouth.layout=FlowLayout()
                    jpanelSouth.add(txtField)
                    jpanelSouth.add(btnSend)
                    //Chat send action listener
                    btnSend.addActionListener {
                        txtArea.append(username +": "+ txtField.text+ "\n")
                        txtField.text = ""
                    }
                    //Adding to the panel
                    frame.add(jpanelSouth,BorderLayout.SOUTH)
                    frame.add(jpanelCenter,BorderLayout.CENTER)
                    frame.isVisible=true
                }else{
                        JOptionPane.showMessageDialog(f,"Unauthorized")
                }

        }
    //Reset button
        btnReset.addActionListener{
            txtFieldUsername.text = ""
            passwordField.text = ""
        }

    // Adding to the panel
        f.add(jpanelSouth, BorderLayout.SOUTH)
        f.add(jpanelCenter, BorderLayout.CENTER)

    // JFrame size and location
        f.setSize(600,400)
        f.setLocation(300,300)
        f.isVisible=true
}
