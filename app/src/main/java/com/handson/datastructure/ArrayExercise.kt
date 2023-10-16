package com.handson.datastructure

import java.util.Arrays

/*before the DS here is the Array implementation hands-on in kotlin*/

fun main() {

    //weekdays without assignment of value
    var weekdays = arrayOfNulls<String>(7)
    println(Arrays.toString(weekdays))

    //weekdays with value
    weekdays = arrayOf("Mon", "Tues", "Wed")
    println(Arrays.toString(weekdays))

    //use loop to iterate the value from the list
    for (i in weekdays) {
        print("$i ".uppercase())
    }
}