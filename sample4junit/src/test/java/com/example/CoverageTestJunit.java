package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class CoverageTestJunit {

    static class DataFixture {
        int input;
        int expected;

        DataFixture(int input, int expected) {
            this.input = input;
            this.expected = expected;
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(-1, 0),
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_if_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(-1, 0),
        };

        @Theory
        public void branch_if_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_else_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_if_else_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_else_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_else_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_if_else_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_else_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_elseif_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
                new DataFixture(10, 0),
        };

        @Theory
        public void branch_if_elseif_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_elseif_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_elseif_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_if_elseif_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_elseif_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_true {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_if_true(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_true(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_if_false {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_if_false(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_if_false(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_ternary_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_ternary_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_ternary_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_ternary_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_ternary_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_ternary_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_switch_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
                new DataFixture(2, 0),
        };

        @Theory
        public void branch_switch_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_switch_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_switch_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_switch_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_switch_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_for_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(5, 0),
        };

        @Theory
        public void branch_for_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_for_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_for_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_for_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_for_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_for_break {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(5, 0),
        };

        @Theory
        public void branch_for_break(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_for_break(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_while_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_while_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_while_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_while_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(10, 0),
        };

        @Theory
        public void branch_while_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_while_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_while_break {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_while_break(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_while_break(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_do_while_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_do_while_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_do_while_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_do_while_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(10, 0),
        };

        @Theory
        public void branch_do_while_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_do_while_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_do_while_break {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_do_while_break(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_do_while_break(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_try_catch_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
        };

        @Theory
        public void branch_try_catch_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_try_catch_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_try_catch_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_try_catch_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_try_catch_NG(f.input), is(f.expected));
        }
    }
/*
    @RunWith(Theories.class)
    public static class branch_macro_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_macro_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_macro_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_macro_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_macro_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_macro_NG(f.input), is(f.expected));
        }
    }
*/
    @RunWith(Theories.class)
    public static class branch_function_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_function_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_function_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_function_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_function_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_function_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_function_ret_OK {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(0, 0),
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_function_ret_OK(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_function_ret_OK(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_function_ret_NG {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_function_ret_NG(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_function_ret_NG(f.input), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_class {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_class(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_class(), is(f.expected));
        }
    }

    @RunWith(Theories.class)
    public static class branch_list {
        @DataPoints
        public static DataFixture[] df = {
                new DataFixture(1, 0),
        };

        @Theory
        public void branch_list(DataFixture f) throws Exception {
            Coverage c = new Coverage();
            assertThat(c.branch_list(), is(f.expected));
        }
    }
}
