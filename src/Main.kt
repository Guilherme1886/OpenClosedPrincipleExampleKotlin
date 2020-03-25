import bank.Bank
import transfer.CreditTransfer
import transfer.DebitTransfer

fun main(args: Array<String>) {


    val bank = Bank()
    bank.makeTransfer(CreditTransfer(100.0))
    bank.makeTransfer(DebitTransfer(200.0))


}