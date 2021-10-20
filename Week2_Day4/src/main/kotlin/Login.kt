import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.*

fun main() {
    var frame=JFrame("My App")
    var logbtn= JButton("Login")
    var resetbtn= JButton("Reset")
    var usernameFeild= JTextField(20)
    var passFeild=JPasswordField(20)
    var usernameLabel=JLabel("username")
    var passLabel=JLabel("Password")
    var southPanel= JPanel()
    var centerPanel=JPanel()



    centerPanel.layout=null
    usernameLabel.setBounds(20,100,80,20)
    usernameFeild.setBounds(100,100,200,20)

    passLabel.setBounds(20,160,100,20)
    passFeild.setBounds(100,160,200,20)

    centerPanel.add(usernameLabel)
    centerPanel.add(usernameFeild)
    centerPanel.add(passLabel)
    centerPanel.add(passFeild)


    southPanel.layout= FlowLayout()
    southPanel.add(logbtn)
    southPanel.add(resetbtn)

    frame.add(centerPanel,BorderLayout.CENTER)
    frame.add(southPanel, BorderLayout.SOUTH)
    frame.setLocation(500,200)
    frame.setSize(400,400)
    frame.isVisible=true




    logbtn.addActionListener {

        var username= usernameFeild.getText().toString()
        var pass=passFeild.getText().toString()

        if(username.equals("Fatima",true)&&pass=="12345"){

            var frame2=JFrame("Second")
            var outputArea=JTextArea()
            var inputArea=JTextField(30)
            var sendbtn=JButton("Send")
            var southPanel=JPanel()
            var name=JLabel("# Written By: ${username.capitalize()} \n")

            frame2.setLocation(500,200)
            frame2.setSize(400,400)
            frame2.layout=BorderLayout()
            frame2.isVisible=true
            outputArea.setText(name.text)

            name.setLocation(200,200)
            name.setFont(Font("Serif".toString(),0,12))

            southPanel.layout=FlowLayout()
            southPanel.add(inputArea)
            southPanel.add(sendbtn)

            frame2.add(southPanel,BorderLayout.SOUTH)
            frame2.add(outputArea,BorderLayout.CENTER)

            sendbtn.addActionListener {
                outputArea.append(inputArea.getText()+"\n")
                inputArea.setText("")
            }



        }else{
            JOptionPane.showMessageDialog(frame,"Login Failed")
        }

    }

    resetbtn.addActionListener {
        usernameFeild.setText("")
        passFeild.setText("")
    }


}