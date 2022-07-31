package common

fun <T> Collection<T>?.nullOrEmpty(instead: Collection<T>?): Collection<T> {
    return if (this.isNullOrEmpty()) {
        instead ?: emptyList()
    } else {
        this
    }
}