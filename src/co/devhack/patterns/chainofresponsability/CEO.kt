class CEO(override val successor: PurchaseOrderApprover?) : PurchaseOrderApprover() {

    override fun proccessRequest(price: Float) {
        if (price <= 100000) {
            println("$price purchase approved by CEO")
        } else {
            println("The order could not be processed")
        }
    }
}