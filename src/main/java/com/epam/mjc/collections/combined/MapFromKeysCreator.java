package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> hehe = new HashMap<>();




        for (Map.Entry<String, Integer> heheboy :
                sourceMap.entrySet()) {
            Set<String> str = new HashSet<>();
            int n  = heheboy.getKey().length();

            for (Map.Entry<String, Integer> i :
                        sourceMap.entrySet()) {
                if (heheboy.getKey().length() == i.getKey().length()){
                    str.add(i.getKey());

                }
                hehe.put(n, str);

            }

        }

        return hehe;

    }
}
