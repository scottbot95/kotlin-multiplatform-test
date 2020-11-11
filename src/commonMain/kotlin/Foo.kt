interface Foo {
    fun foo()
}

interface DefaultFoo: Foo {
    override fun foo() = Unit
}

class FooImpl: DefaultFoo, Foo
