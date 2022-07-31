package common

fun <T> Collection<T>?.nullOrEmpty(instead: Collection<T>?): Collection<T> {
    return if (this.isNullOrEmpty()) {
        instead ?: emptyList()
    } else {
        this
    }
}

fun <K, V> Map<K, V>?.nullOrEmpty(instead: Map<K, V>?): Map<K, V> {
    return if (this.isNullOrEmpty()) {
        instead ?: emptyMap()
    } else {
        this
    }
}