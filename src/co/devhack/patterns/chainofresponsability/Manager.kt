class Manager(override val successor: PurchaseOrderApprover) : PurchaseOrderApprover() {

    override fun proccessRequest(price: Float) {
        if (price <= 10000) {
            println("$price purchase approved by Manager")
        } else {
            successor.proccessRequest(price)
        }
    }
}