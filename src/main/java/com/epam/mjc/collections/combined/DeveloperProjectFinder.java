package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> hehe = new ArrayList<>();



        for (Map.Entry<String,Set<String>> heheboy:
                    projects.entrySet()) {
            if (heheboy.getValue().contains(developer)) {
                hehe.add(heheboy.getKey());
            }
        }

        Collections.reverse(hehe);


        return hehe;
    }
}
