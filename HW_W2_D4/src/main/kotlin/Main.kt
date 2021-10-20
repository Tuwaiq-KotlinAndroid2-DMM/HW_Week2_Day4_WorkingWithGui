import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Label
import java.awt.TextField
import javax.swing.*
import javax.swing.plaf.metal.MetalBorders

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

  f.add(jpanelSouth, BorderLayout.SOUTH)
  f.add(jpanelCenter, BorderLayout.CENTER)

  f.setSize(600, 400)
  f.setLocation(300, 300)

  btnLogin.addActionListener {
    var username = txtFieldUsername.text
    var pss = passwordField.text
    if (username.equals("emtnan") && pss.equals("1234")) {
      JOptionPane.showMessageDialog(f, "enter true")

      var f2 = JFrame("MY APP")
      f2.layout = BorderLayout()
      var textArea = JTextArea()
      var btsend = JButton("Send")
      var textField = JTextField(50)
      btsend.addActionListener {
        textArea.text+="${textField.text}\n"
      }
      f2.add(textArea)


      var jpanelSouth1 = JPanel()
      jpanelSouth1.layout = FlowLayout()
      jpanelSouth1.add(textField)
      jpanelSouth1.add(btsend)


      f2.add(jpanelSouth1, BorderLayout.SOUTH)


      f2.setSize(600, 400)
      f2.setLocation(300, 300)
      f2.isVisible = true
    } else {
      JOptionPane.showMessageDialog(f, "enter false")
    }


  }


  btnReset.addActionListener {
    txtFieldUsername.text = ""
    passwordField.text = ""
  }
  f.isVisible=true

}









