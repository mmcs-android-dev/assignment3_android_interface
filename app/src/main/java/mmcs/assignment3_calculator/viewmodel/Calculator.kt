package mmcs.assignment3_calculator.viewmodel

import androidx.databinding.ObservableField

enum class Operation { ADD, SUB, MUL, DIV }

interface Calculator {

    var display: ObservableField<String>
    var hasPoint: Boolean

    fun addDigit(number: Int)
    fun addPoint()
    fun addOperation(op: Operation)

    fun compute()

    fun clear()
    fun reset()
}