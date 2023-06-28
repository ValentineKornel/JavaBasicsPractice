package com.epam.rd.autotasks.max;

import java.util.Optional;
import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt maxOptionalInt;
        int maxEl = -999;
        if(values != null && values.length > 0){
            for(int el:values){
                if(el > maxEl)
                    maxEl = el;
            }
            maxOptionalInt = OptionalInt.of(maxEl);
            return maxOptionalInt;
        }
        else return OptionalInt.empty();
    }
}
