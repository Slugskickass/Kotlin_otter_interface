import java.awt.CardLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.GridLayout
import java.awt.event.*
import javax.swing.*
import javax.swing.JComboBox
import javax.swing.JButton
import javax.swing.event.ChangeEvent







class windowcleaner : JPanel() {
    val label_Period = JLabel("    Period    ")
    val label_Start = JLabel("    Start    ")
    val label_Ontime = JLabel("    On Time    ")
    val label_Output = JLabel("Output")
    val actions_avail = arrayOf("Period", "Start", "On time")
    val buttonmoon = JButton("spoon")
    val checker = JCheckBox("checker")
    val Period_output = JSpinner()
    val Start_output = JSpinner()
    val Ontime_output = JSpinner()
    val actions_combobox = JComboBox(actions_avail)

    // Define the panel to hold the buttons
    val panel1 =  JPanel()
    val panel2 =  JPanel()
    val panel3 =  JPanel()
    val panel4 =  JPanel()

    init {

        // Set up the title for different panels
        panel1.border = BorderFactory.createTitledBorder("Period");
        panel2.border = BorderFactory.createTitledBorder("Start");
        panel3.border = BorderFactory.createTitledBorder("On time");
        panel2.border = BorderFactory.createTitledBorder("  SET  ");

        // layout = BoxLayout(this, BoxLayout.X_AXIS)
        // Set up the BoxLayout
        val layout1 = BoxLayout(panel1, BoxLayout.Y_AXIS)
        val layout2 = BoxLayout(panel2, BoxLayout.Y_AXIS)
        val layout3 = BoxLayout(panel3, BoxLayout.Y_AXIS)
        val layout4 = BoxLayout(panel4, BoxLayout.Y_AXIS)
        panel1.setLayout(layout1)
        panel2.setLayout(layout2)
        panel3.setLayout(layout3)
        panel4.setLayout(layout4)

        label_Period.setAlignmentX(LEFT_ALIGNMENT);

        add(panel1)
        panel1.add(label_Period)
        panel1.add(Period_output)


        add(panel2)
        panel2.add(label_Start)
//      panel2.add(actions_combobox)
        panel2.add(Start_output)

        add(panel3)
        panel3.add(label_Ontime)
        panel3.add(Ontime_output)
//      panel3.add(checker)

        add(panel4)
        panel4.add(buttonmoon)

        checker.addItemListener { e ->
            val sel: Int = e.stateChange
            if (sel == ItemEvent.SELECTED) {
                println("kit")
            } else {
                label_Output.setText("ten")
                println("ten")
            }
        }



        buttonmoon.addActionListener{ e ->
            val kittens = actions_combobox.selectedItem
            if(kittens != null) {
                label_Output.text = kittens.toString()
             }
            }
        }
    }



fun main(){

    JFrame("Kittens").apply {
        add(windowcleaner())
        size = Dimension(640, 120)
        isVisible = true
        addWindowListener(object : WindowAdapter() {
            override fun windowClosing(windowEvent: WindowEvent?) {
                System.exit(0)
            }})
    }
}

