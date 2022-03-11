package com.adriano.conjectura_collatz;

import java.util.ArrayList;
import java.util.List;

public class ConjecturaCollatz {

    public List<Integer> processar(Integer initValue) {
        List<Integer> result = new ArrayList<>();
        int i = initValue;
        if (i < 0) {
            return result;
        }
        result.add(i);
        while (i != 1) {
            if (i % 2 == 1)
                i = (i * 3) + 1;
            else
                i = i / 2;

            result.add(i);
        }
        return result;
    }
}

