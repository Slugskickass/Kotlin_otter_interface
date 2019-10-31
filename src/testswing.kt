//package com.zetcode

import java.awt.EventQueue
import javax.swing.*
import javax.swing.text.StyleConstants.setForeground



class KotlinSwingSimpleEx(title: String) : JFrame() {

    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(300, 200)
        setLocationRelativeTo(null)
    }
}

private fun createAndShowGUI() {

    val frame = KotlinSwingSimpleEx("Simple")
    frame.isVisible = true
}

fun main(args: Array<String>) {
    createAndShowGUI()
    //EventQueue.invokeLater(::createAndShowGUI)
}