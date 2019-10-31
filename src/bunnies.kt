package com.zetcode

import java.awt.Container
import java.awt.EventQueue
import javax.swing.GroupLayout
import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JComponent
import javax.swing.JFrame
import javax.swing.JFrame.EXIT_ON_CLOSE

class ImageIconButtonsEx : JFrame() {
    init {

        initUI()
    }

    private fun initUI() {

        val quitIcon = ImageIcon("/Users/Ashley/IdeaProjects/Kotlin_test/src/errors.png")
        val saveIcon = ImageIcon("/Users/Ashley/IdeaProjects/Kotlin_test/src/pluss.png")
        val homeIcon = ImageIcon("/Users/Ashley/IdeaProjects/Kotlin_test/src/errors.png")

        val quitBtn = JButton(quitIcon)
        val saveBtn = JButton(saveIcon)
        val homeBtn = JButton(homeIcon)

        createLayout(quitBtn, saveBtn, homeBtn)

        title = "JButtons"
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
    }

    private fun createLayout(vararg arg: JComponent) {

        val pane = contentPane
        val gl = GroupLayout(pane)
        pane.layout = gl

        gl.autoCreateContainerGaps = true
        gl.autoCreateGaps = true

        gl.setHorizontalGroup(
            gl.createSequentialGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
        )

        gl.setVerticalGroup(
            gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addComponent(arg[2])
        )

        gl.linkSize(arg[0], arg[1], arg[2])

        pack()
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            EventQueue.invokeLater {
                val ex = ImageIconButtonsEx()
                ex.isVisible = true
            }
        }
    }
}