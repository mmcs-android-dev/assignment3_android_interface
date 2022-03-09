package mmcs.assignment3_calculator.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField

class CalculatorViewModel: BaseObservable(), Calculator {
    override var display: ObservableField<String>
        get() = TODO("Not yet implemented")
        set(value) {}

    override var hasPoint: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun addDigit(number: Int) {
        TODO("Not yet implemented")
    }

    override fun addPoint() {
        TODO("Not yet implemented")
    }

    override fun addOperation(op: Operation) {
        TODO("Not yet implemented")
    }

    override fun compute() {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun reset() {
        TODO("Not yet implemented")
    }
}