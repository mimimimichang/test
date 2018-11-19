package com.example.kotlinexample

class Coverage {
    fun branch_if_OK(i: Int): Int {
        if (i >= 0 && i <= 10) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_NG(i: Int): Int {
        if (i >= 0 && i <= 10) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_else_OK(i: Int): Int {
        val j: Int

        if (i == 0) {
            j = 0
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        } else {
            j = i
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_else_NG(i: Int): Int {
        val j: Int

        if (i == 0) {
            j = 0
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        } else {
            j = i
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_elseif_OK(i: Int): Int {
        val j: Int

        if (i == 0) {
            j = 0
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        } else if (i < 10) {
            j = i
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        } else {
            j = 100
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_elseif_NG(i: Int): Int {
        val j: Int

        if (i == 0) {
            j = 0
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        } else if (i < 10) {
            j = i
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        } else {
            j = 100
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_true(i: Int): Int {
        if (true) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_if_false(i: Int): Int {
        if (false) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_ternary_OK(i: Int): Int {
        val j: Int

        j = if (i == 0) 0 else 1

        return 0
    }

    fun branch_ternary_NG(i: Int): Int {
        val j: Int

        j = if (i == 0) 0 else 1

        return 0
    }

    fun branch_when_OK(i: Int): Int {
        when (i) {
            0 ->
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
            1 ->
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
            else ->
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_when_NG(i: Int): Int {
        when (i) {
            0 ->
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
            1 ->
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
            else ->
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_for_OK(i: Int): Int {
        val j: Int
        for (j in 0..i) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_for_NG(i: Int): Int {
        val j: Int
        for (j in 0..i) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }

        return 0
    }

    fun branch_for_break(i: Int): Int {
        val j: Int
        for (j in 0..10) {
            if (i == j) {
                println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
                break
            }
        }

        return 0
    }

    fun branch_while_OK(i: Int): Int {
        var j: Int = i

        while (j < 10) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), j))
            j++
        }

        return 0
    }

    fun branch_while_NG(i: Int): Int {
        var j: Int = i

        while (j < 10) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), j))
            j++
        }

        return 0
    }

    fun branch_while_break(i: Int): Int {
        var j: Int = i

        while (j < 10) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), j))
            j++

            if (i == 5) {
                break
            }
        }

        return 0
    }

    fun branch_do_while_OK(i: Int): Int {
        var j: Int = i

        do {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), j))
            j++
        } while (j < 10)

        return 0
    }

    fun branch_do_while_NG(i: Int): Int {
        var j: Int = i

        do {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), j))
            j++
        } while (j < 10)

        return 0
    }

    fun branch_do_while_break(i: Int): Int {
        var j: Int = i

        do {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), j))
            break
        } while (j < 10)

        return 0
    }

    fun branch_try_catch_OK(i: Int): Int {
        try {
            if (i == 0) {
                throw Exception("Exception")
            }
        } catch (e: Exception) {
            println("Catch")
        }

        return 0
    }

    fun branch_try_catch_NG(i: Int): Int {
        try {
            if (i == 0) {
                throw Exception("Exception")
            }
        } catch (e: Exception) {
            println("Catch")
        }

        return 0
    }

    inline fun branch_macro(i: Int) {
        if (i == 0) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }
    }

    fun branch_macro_OK(i: Int): Int {
        branch_macro(i)

        return 0
    }

    fun branch_macro_NG(i: Int): Int {
        branch_macro(i)

        return 0
    }

    fun branch_function(i: Int) {
        if (i == 0) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
        }
    }

    fun branch_function_OK(i: Int): Int {
        branch_function(i)

        return 0
    }

    fun branch_function_NG(i: Int): Int {
        branch_function(i)

        return 0
    }

    fun branch_function_ret(i: Int): Int {
        val ret: Int

        if (i == 0) {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
            ret = 0
        } else {
            println("%s: %d".format(Thread.currentThread().getStackTrace()[0].getMethodName(), i))
            ret = i
        }

        return ret
    }

    fun branch_function_ret_OK(i: Int): Int {
        val j: Int = branch_function_ret(i)

        return 0
    }

    fun branch_function_ret_NG(i: Int): Int {
        val j: Int = branch_function_ret(i)

        return 0
    }

    fun branch_class(): Int {
        val c = Coverage2(0)

        c.test(5)

        return 0
    }

    fun branch_list(): Int {
        val list: MutableList<Int> = mutableListOf()
        list.add(0)

        return 0
    }
}
