# Review

## Want to add more counters?

You'll need a `mutableList` then.

Note this is different to `val`/`var`: an immutable list defined with `var` can't have items added to it, but you can make a mutable copy of the list, add your value and assign the new list back to counters.

Try it and see!

````
    var counters = listOf(c, c1, c)
    val counters2 = counters.toMutableList()
    counters2.add(c1)
    counters = counters2
````

## Using with and apply and other scoping functions

These are handy when working with lots of members of a class, say, and also if nullable values are involved.

They allow you "to execute a block of code within the context of an object." (https://kotlinlang.org/docs/reference/scope-functions.html)

````
c.apply {
    println("$name is $count")
}
````

Probably wouldn't use it in that situation but it gives you an idea of how it can be used.

They will return, most likely!

## Data classes

These are very cool and cut down on a heap of code. See the equivalent class in Java for a counter:

````
class Counter {
    String name;
    int count;
    
    Counter(String name) {
        this.name = name;
    }
    
    void setCount(int i) {
        count = i;
    }
    
    int getCount() {
        return count;
    }
    
    String getName() {
        return name;
    }
    
    void increment() {
        count += 1;
    }
 }
 ````

Seriously. Even if the IDE generates this for you, it is a pain to maintain.

````
data class Counter(val name: String, var count: Int = 0) {
    fun increment() {
        count += 1
    }
}
````

These can also be copied using `.copy()`.

## Custom accessors

Like in C# custom accessors can be set up.

````
val isZero: Boolean
    get() = count == 0
````