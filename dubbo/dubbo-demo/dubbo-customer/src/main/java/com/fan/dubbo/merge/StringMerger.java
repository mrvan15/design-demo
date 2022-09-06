package com.fan.dubbo.merge;

import org.apache.dubbo.rpc.cluster.Merger;

public class StringMerger implements Merger<String> {
    @Override
    public String merge(String... items) {
        if (items.length == 0){
            return null;
        }

        StringBuilder builder = new StringBuilder();
        for (String item : items) {
            if (item != null){
                builder.append(item).append("-");
            }
        }
        return builder.toString();
    }
}
