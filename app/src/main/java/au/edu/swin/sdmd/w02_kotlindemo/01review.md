# Review

## Return types

These aren't always needed but are a good habit to get into.

## String interpolation

Use `$` for variables; for a function call or when using object properties, don't forget the curly braces.

## Using ?:

The loooooong way of doing this would be:

````kotlin
if (name == null) {
    return "random student"
} else {
    return name
}
````

Even within Kotlin this can be shortened to:

`if (name == null) "random student" else name`

You'll get a handy hint though if you try this.