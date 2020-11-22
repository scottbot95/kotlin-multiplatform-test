typealias FooConstructor<T, U> = (value: T) -> U

open class ValueWrapper<T>(val value: T)


class FooContainer<T> {
    private fun <U : ValueWrapper<T>> callCtor(value: T, constructor: FooConstructor<T, U>): U = constructor(value)
    fun ctorCallLambda(value: T) = callCtor(value) { ValueWrapper(value) } // WORKS
    fun ctorCallReference(value: T) = callCtor(value, ::ValueWrapper) // EXPLODES
}
