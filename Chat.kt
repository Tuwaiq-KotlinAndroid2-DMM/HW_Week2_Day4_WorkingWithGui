import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextArea

fun main() {
	// Main frame
	val frame = JFrame("Chat App")
	frame.layout = BorderLayout(0, 10)

	// History text area (Conversation)
	val historyTextArea = JTextArea()
	historyTextArea.isEnabled = false
	frame.add(historyTextArea)

	// Bottom items container
	val jPanel = JPanel()
	jPanel.layout = BorderLayout()
	jPanel.preferredSize = Dimension(100, 50)
	frame.add(jPanel, BorderLayout.SOUTH)

	// Message text area (User input)
	val messageTextArea = JTextArea()
	jPanel.add(messageTextArea, BorderLayout.CENTER)

	// Send button
	val sendButton = JButton("Send")
	jPanel.add(sendButton, BorderLayout.EAST)

	sendButton.addActionListener {
		historyTextArea.text = "${historyTextArea.text}\n${messageTextArea.text}"
		messageTextArea.text = ""
	}

	frame.setSize(700, 550)
	frame.isVisible = true
	frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
	frame.setLocationRelativeTo(null)
}