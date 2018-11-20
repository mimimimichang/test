package com.example;

import java.util.ArrayList;

public class Coverage {
    public static int branch_if_OK(int i) {
        if (i >= 0 && i <= 10) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_NG(int i) {
        if (i >= 0 && i <= 10) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_else_OK(int i) {
        int j;

        if (i == 0) {
            j = 0;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        } else {
            j = i;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_else_NG(int i) {
        int j;

        if (i == 0) {
            j = 0;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        } else {
            j = i;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_elseif_OK(int i) {
        int j;

        if (i == 0) {
            j = 0;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        } else if (i < 10) {
            j = i;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        } else {
            j = 100;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_elseif_NG(int i) {
        int j;

        if (i == 0) {
            j = 0;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        } else if (i < 10) {
            j = i;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        } else {
            j = 100;
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_true(int i) {
        if (true) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_if_false(int i) {
        if (false) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_ternary_OK(int i) {
        int j;

        if (i == 0) {
            j = 0;
        } else {
            j = 1;
        }

        return 0;
    }

    public static int branch_ternary_NG(int i) {
        int j;

        if (i == 0) {
            j = 0;
        } else {
            j = 1;
        }

        return 0;
    }

    public static int branch_switch_OK(int i) {
        switch (i) {
            case 0:
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
                break;
            case 1:
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
                break;
            default:
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_switch_NG(int i) {
        switch (i) {
            case 0:
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
                break;
            case 1:
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
                break;
            default:
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_for_OK(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_for_NG(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_for_break(int i) {
        for (int j = 0; j < 10; j++) {
            if (i == j) {
                System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
                break;
            }
        }

        return 0;
    }

    public static int branch_while_OK(int i) {
        int j = i;

        while (j < 10) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), j));
            j++;
        }

        return 0;
    }

    public static int branch_while_NG(int i) {
        int j = i;

        while (j < 10) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), j));
            j++;
        }

        return 0;
    }

    public static int branch_while_break(int i) {
        int j = i;

        while (j < 10) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), j));
            j++;

            if (i == 5) {
                break;
            }
        }

        return 0;
    }

    public static int branch_do_while_OK(int i) {
        int j = i;

        do {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), j));
            j++;
        } while (j < 10);

        return 0;
    }

    public static int branch_do_while_NG(int i) {
        int j = i;

        do {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), j));
            j++;
        } while (j < 10);

        return 0;
    }

    public static int branch_do_while_break(int i) {
        int j = i;

        do {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), j));
            break;
        } while (j < 10);

        return 0;
    }

    public static int branch_try_catch_OK(int i) {
        try {
            if (i == 0) {
                throw new Exception("Exception");
            }
        } catch (Exception e) {
            System.out.println("Catch");
        }

        return 0;
    }

    public static int branch_try_catch_NG(int i) {
        try {
            if (i == 0) {
                throw new Exception("Exception");
            }
        } catch (Exception e) {
            System.out.println("Catch");
        }

        return 0;
    }
/*
    inline public static int branch_macro(int i) {
        if (i == 0) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }
    }

    public static int branch_macro_OK(int i) {
        branch_macro(i);

        return 0;
    }

    public static int branch_macro_NG(int i) {
        branch_macro(i);

        return 0;
    }
*/
    public static int branch_function(int i) {
        if (i == 0) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
        }

        return 0;
    }

    public static int branch_function_OK(int i) {
        branch_function(i);

        return 0;
    }

    public static int branch_function_NG(int i) {
        branch_function(i);

        return 0;
    }

    public static int branch_function_ret(int i) {
        int ret;

        if (i == 0) {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
            ret = 0;
        } else {
            System.out.println("%s: %d".format(Thread.currentThread().getStackTrace()[1].getMethodName(), i));
            ret = i;
        }

        return ret;
    }

    public static int branch_function_ret_OK(int i) {
        int j = branch_function_ret(i);

        return 0;
    }

    public static int branch_function_ret_NG(int i) {
        int j = branch_function_ret(i);

        return 0;
    }

    public static int branch_class() {
        Coverage2 c = new Coverage2(0);

        c.test(5);

        return 0;
    }

    public static int branch_list() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);

        return 0;
    }
}
