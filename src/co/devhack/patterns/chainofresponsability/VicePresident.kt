class VicePresident(override val successor: PurchaseOrderApprover) : PurchaseOrderApprover() {

    override fun proccessRequest(price: Float) {
        if (price <= 25000) {
            println("$price purchase approved by VicePresident")
        } else {
            successor.proccessRequest(price)
        }
    }
}