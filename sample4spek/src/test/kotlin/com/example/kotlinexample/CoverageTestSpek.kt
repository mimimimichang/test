package com.example.kotlinexample

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.data_driven.data
import org.jetbrains.spek.data_driven.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.junit.Assert.*;

@RunWith(JUnitPlatform::class)
object CoverageTestSpek : Spek({
    describe("branch_if_OK") {
        val cov = Coverage()

        on("branch_if_OK: input = %s",
                data(-1, expected = 0),
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_OK(i))
            }
        }
    }

    describe("branch_if_NG") {
        val cov = Coverage()

        on("branch_if_NG: input = %s",
                data(-1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_NG(i))
            }
        }
    }

    describe("branch_if_else_OK") {
        val cov = Coverage()

        on("branch_if_else_OK: input = %s",
                data(0, expected = 0),
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_else_OK(i))
            }
        }
    }

    describe("branch_if_else_NG") {
        val cov = Coverage()

        on("branch_if_else_NG: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_else_NG(i))
            }
        }
    }

    describe("branch_if_elseif_OK") {
        val cov = Coverage()

        on("input = %s",
                data(0, expected = 0),
                data(1, expected = 0),
                data(10, expected = 0)

        ) { i, expected ->
            it("branch_if_elseif_OK: expected = $expected") {
                assertEquals(expected, cov.branch_if_elseif_OK(i))
            }
        }
    }

    describe("branch_if_elseif_NG") {
        val cov = Coverage()

        on("branch_if_elseif_NG: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_elseif_NG(i))
            }
        }
    }

    describe("branch_if_true") {
        val cov = Coverage()

        on("branch_if_true: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_true(i))
            }
        }
    }

    describe("branch_if_false") {
        val cov = Coverage()

        on("branch_if_false: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_if_false(i))
            }
        }
    }

    describe("branch_ternary_OK") {
        val cov = Coverage()

        on("branch_ternary_OK: input = %s",
                data(0, expected = 0),
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_ternary_OK(i))
            }
        }
    }

    describe("branch_ternary_NG") {
        val cov = Coverage()

        on("branch_ternary_NG: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_ternary_NG(i))
            }
        }
    }

    describe("branch_when_OK") {
        val cov = Coverage()

        on("branch_when_OK: input = %s",
                data(0, expected = 0),
                data(1, expected = 0),
                data(2, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_when_OK(i))
            }
        }
    }

    describe("branch_when_NG") {
        val cov = Coverage()

        on("branch_when_NG: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_when_NG(i))
            }
        }
    }

    describe("branch_for_OK") {
        val cov = Coverage()

        on("branch_for_OK: input = %s",
                data(5, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_for_OK(i))
            }
        }
    }

    describe("branch_for_NG") {
        val cov = Coverage()

        on("branch_for_NG: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_for_NG(i))
            }
        }
    }

    describe("branch_for_break") {
        val cov = Coverage()

        on("branch_for_break: input = %s",
                data(5, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_for_break(i))
            }
        }
    }

    describe("branch_while_OK") {
        val cov = Coverage()

        on("branch_while_OK: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_while_OK(i))
            }
        }
    }

    describe("branch_while_NG") {
        val cov = Coverage()

        on("branch_while_NG: input = %s",
                data(10, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_while_NG(i))
            }
        }
    }

    describe("branch_while_break") {
        val cov = Coverage()

        on("branch_while_break: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_while_break(i))
            }
        }
    }

    describe("branch_do_while_OK") {
        val cov = Coverage()

        on("branch_do_while_OK: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_do_while_OK(i))
            }
        }
    }

    describe("branch_do_while_NG") {
        val cov = Coverage()

        on("branch_do_while_NG: input = %s",
                data(10, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_do_while_NG(i))
            }
        }
    }

    describe("branch_do_while_break") {
        val cov = Coverage()

        on("branch_do_while_break: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_do_while_break(i))
            }
        }
    }

    describe("branch_try_catch_OK") {
        val cov = Coverage()

        on("branch_try_catch_OK: input = %s",
                data(0, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_try_catch_OK(i))
            }
        }
    }

    describe("branch_try_catch_NG") {
        val cov = Coverage()

        on("branch_try_catch_NG: input = %s",
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_try_catch_NG(i))
            }
        }
    }

    describe("branch_macro_OK") {
        val cov = Coverage()

        on("branch_macro_OK: input = %s",
                data(0, expected = 0),
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_macro_OK(i))
            }
        }
    }

    describe("branch_macro_NG") {
        val cov = Coverage()

        on("branch_macro_NG: input = %s",
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_macro_NG(i))
            }
        }
    }

    describe("branch_function_OK") {
        val cov = Coverage()

        on("branch_function_OK: input = %s",
                data(0, expected = 0),
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_function_OK(i))
            }
        }
    }

    describe("branch_function_NG") {
        val cov = Coverage()

        on("branch_function_NG: input = %s",
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_function_NG(i))
            }
        }
    }

    describe("branch_function_ret_OK") {
        val cov = Coverage()

        on("branch_function_ret_OK: input = %s",
                data(0, expected = 0),
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_function_ret_OK(i))
            }
        }
    }

    describe("branch_function_ret_NG") {
        val cov = Coverage()

        on("branch_function_ret_NG: input = %s",
                data(1, expected = 0)

        ) { i, expected ->
            it("expected = $expected") {
                assertEquals(expected, cov.branch_function_ret_NG(i))
            }
        }
    }

    describe("branch_class") {
        val cov = Coverage()

        on("branch_class: class") {
            val expected = 0
            it("expected") {
                assertEquals(expected, cov.branch_class())
            }
        }
    }

    describe("branch_list") {
        val cov = Coverage()

        on("branch_list: list") {
            val expected = 0
            it("expected") {
                assertEquals(expected, cov.branch_list())
            }
        }
    }
})
