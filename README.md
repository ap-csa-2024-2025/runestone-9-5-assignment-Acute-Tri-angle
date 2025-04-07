[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19057502)
# runestone-9-5-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

The following code contains a class called `ShoppingCart` that simulates a grocery store or an online store’s shopping cart. It has an `ArrayList` called order that you can use to add `Items` to the shopping cart. The `Item` class keeps track of the name and the price of each Item. If you run the code below, you will see that it adds 2 items to the cart and then prints out the total order.

In this challenge, you will add a new class called `DiscountedItem` that extends the `Item` class. The `ArrayList` of `Item` will still work since it can hold the subclasses of `Item` too! The `ShoppingCart` `printOrder` method will work with `Item` and `DiscountedItem` but note that it has an if statement that treats `DiscountedItem` differently.

In the `DiscountedItem` subclass,

1. Add an instance variable for the discount amount.
2. Add constructors that call the super constructor Item.
3. Add get/set methods for discount. The get method is given below but you should modify it.
4. Add a `toString` method that returns a string that includes a call to the super `toString` method that will print out the price as well as the discount amount using the `super.valueToString()` method to format it. You could put the discount in parentheses with a minus sign in front of it like `(- $.50)`.
5. Uncomment the code in the main method to test adding DiscountedItems to the cart.