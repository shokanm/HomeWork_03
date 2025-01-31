package otus.homework.flowcats

data class CatFactResponse(
    val current_page: Int,
    val data: List<Fact>,
    val first_page_url: String,
    val from: Int,
    val last_page: Int,
    val last_page_url: String,
    val links: List<Link>,
    val next_page_url: String,
    val path: String,
    val per_page: Int,
    val prev_page_url: Any,
    val to: Int,
    val total: Int
)

data class Fact(
    val fact: String,
    val length: Int
)

data class Link(
    val active: Boolean,
    val label: String,
    val url: Any
)