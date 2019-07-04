class PurchaseOrderSystem {

    protected val approvalChain: PurchaseOrderApprover

    init {
        val ceo = CEO(null)
        val vicePresident = VicePresident(ceo)
        val manager = Manager(vicePresident)

        approvalChain = manager
    }

    fun proccessRequest(price: Float) {
        approvalChain.proccessRequest(price)
    }
}