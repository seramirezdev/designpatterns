abstract class PurchaseOrderApprover {

    protected abstract val successor: PurchaseOrderApprover?

    abstract fun proccessRequest(price: Float)
}