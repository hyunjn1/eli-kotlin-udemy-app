package data

// 프로젝트 전역에서 상품데이터를 저장하는 클래스이므로 항상 같은 값이 유지되어야 한다.
// 따라서 싱글턴 객체가 적합
object CartItems {
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProduct(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }
}