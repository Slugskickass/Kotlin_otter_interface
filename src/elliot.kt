import java.awt.CardLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.GridLayout
import java.awt.event.*
import javax.swing.*
import javax.swing.JComboBox
import javax.swing.JButton
import javax.swing.event.ChangeEvent
import javax.swing.ImageIcon






class windowcleaner : JPanel() {
    val label_Period = JLabel("    Period    ")
    val label_Start = JLabel("    Start    ")
    val label_Ontime = JLabel("    On Time    ")
    val label_Selection= JLabel("Input Selection")
    val label_Output = JLabel("Output")
    val Outputs_avail = arrayOf("Output 1", "Output 2", "Output 3", "Output 4", "Output 5")
//    val buttonmoon = JButton("spoon")
    val checker = JCheckBox("checker")
    val Period_output = JSpinner()
    val Start_output = JSpinner()
    val Ontime_output = JSpinner()
    val actions_combobox = JComboBox(Outputs_avail)
    var icon = ImageIcon("/Users/Ashley/IdeaProjects/Kotlin_test/src/OTTER-64.png")
    var cool_button = JButton(icon)




    // Define the panel to hold the buttons
    val panel1 =  JPanel()
    val panel2 =  JPanel()
    val panel3 =  JPanel()
    val panel4 =  JPanel()

    init {
        layout = GridLayout(1,6)
        // Set up the title for different panels
//        panel1.border = BorderFactory.createTitledBorder("Output");
//        panel2.border = BorderFactory.createTitledBorder("Period");
//        panel3.border = BorderFactory.createTitledBorder("  Start  ");
//        panel4.border = BorderFactory.createTitledBorder("On time");

        // layout = BoxLayout(this, BoxLayout.X_AXIS)
        // Set up the BoxLayout
        val panel = arrayOf("Output", "Period","Start", "On time", "Text", "Button")
            .map { BorderFactory.createTitledBorder(it) }
            .map { JPanel().apply { border = it }}
            .apply { forEach {
                it.layout = BoxLayout(it, BoxLayout.Y_AXIS)
            } }

  //      val layout1 = BoxLayout(panel1, BoxLayout.Y_AXIS)
  //      val layout2 = BoxLayout(panel2, BoxLayout.Y_AXIS)
  //      val layout3 = BoxLayout(panel3, BoxLayout.Y_AXIS)
  //      val layout4 = BoxLayout(panel4, BoxLayout.Y_AXIS)
   //     panel1.setLayout(layout1)
   //     panel2.setLayout(layout2)
   //     panel3.setLayout(layout3)
   //     panel4.setLayout(layout4)

        label_Selection.setAlignmentX(LEFT_ALIGNMENT);

        add(panel[0])
        panel[0].add(label_Selection)
        panel[0].add(actions_combobox)

        add(panel[1])
        panel[1].add(label_Period)
        Period_output.preferredSize = Dimension(100,20)
        panel[1].add(Period_output)


        add(panel[2])
//      Start_output.setSize(10,1)
        panel[2].add(label_Start)
//      panel[2].add(actions_combobox)
        Start_output.preferredSize = Dimension(500,20)
        panel[2].add(Start_output)

        add(panel[3])
        panel[3].add(label_Ontime)
        panel[3].add(Ontime_output)
//      panel[3].add(checker)

        add(panel[4])
        panel[4].add(label_Output)

        add(panel[5])
        panel[5].add(cool_button)



        checker.addItemListener { e ->
            val sel: Int = e.stateChange
            if (sel == ItemEvent.SELECTED) {
                println("kit")
            } else {
                label_Output.setText("ten")
                println("ten")
            }
        }

        cool_button.addActionListener{ e ->
            val kittens = actions_combobox.selectedItem
            val bunnies = Period_output.value
            if(kittens != null) {
                label_Output.text = kittens.toString() + " Period " + bunnies.toString() + " Start " + Start_output.value.toString()
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

