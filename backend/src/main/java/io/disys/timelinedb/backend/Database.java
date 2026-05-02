package io.disys.timelinedb.backend;

public interface Database {
    String name();
    static Database of(String name) {
        return () -> name;
    }
}