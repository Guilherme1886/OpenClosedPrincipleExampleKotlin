package transfer


class DebitTransfer(val value: Double) : Transfer() {
    override fun makeTransfer() {
        println("making transfer to debit account: R$ $value")
    }

}