package io.disys.timelinedb.backend;

public interface WriteTxn extends WriteHandle, AutoCloseable {
    void commit();
    @Override
    void close();
}
