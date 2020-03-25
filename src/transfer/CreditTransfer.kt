package transfer

class CreditTransfer(val value: Double) : Transfer() {
    override fun makeTransfer() {
        println("making transfer to credit account: R$ $value")
    }
}