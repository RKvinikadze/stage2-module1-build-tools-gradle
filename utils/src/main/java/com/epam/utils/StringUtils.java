package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return !str.startsWith("0") && NumberUtils.isCreatable(str) && NumberUtils.toDouble(str) > 0;
    }
}
