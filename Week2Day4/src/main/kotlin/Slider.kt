import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.Font
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JSlider

fun main() {
    var f= JFrame("My App")
    f.layout= BorderLayout()

    var labelUSername= JLabel("Username")
    labelUSername.setBounds(20,100,80,20)

    var slider = JSlider(12,100)

    slider.setBounds(20,160,100,20)
    slider.addChangeListener {
            var fontSize = slider.value
            labelUSername.font = Font("",Font.PLAIN,fontSize)
    }


    var jpanelCenter=JPanel()
    jpanelCenter.layout=null
    jpanelCenter.add(slider)
    jpanelCenter.add(labelUSername)

    f.add(jpanelCenter,BorderLayout.CENTER)
    f.setSize(600,400)
    f.setLocation(300,300)
    f.isVisible=true
}