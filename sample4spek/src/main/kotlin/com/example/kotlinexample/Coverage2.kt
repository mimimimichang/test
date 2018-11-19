package com.example.kotlinexample

class Coverage2(val i: Int) {
    fun test(i: Int) {
        println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
    }
}
