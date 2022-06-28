package screen

class ShoppingCategory {

    fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")
        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하시려면 #을 입력해주세요.")

        var selectedCategory = readLine()
        while (selectedCategory.isNullOrBlank()) {
            println("원하시는 카테고리를 입력해주세요.")
            selectedCategory = readLine()
        }
        if (selectedCategory == "#") {
            // TODO 1. 장바구니 이동
        } else {

            if (categories.contains(selectedCategory)) {
                val shoppingProductList = ShoppingProductList()
                shoppingProductList.showProducts(selectedCategory)
            } else {
                showErrorMessage(selectedCategory)
                // 함수로 전환해서 else 단에서 어떤 행위를 하려했는지 드러낼 수 있다.
            }

        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory] : 존재하지 않는 카테고리입니다. 다시 입력해주세요.")
        showCategories()
    }
}