package io.disys.timelinedb.backend;

public interface WriteHandle extends ReadHandle {
    void put(Database db, byte[] key, byte[] value);
    void delete(Database db, byte[] key);
}
