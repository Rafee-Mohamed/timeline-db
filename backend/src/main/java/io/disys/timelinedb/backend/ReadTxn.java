package io.disys.timelinedb.backend;

public interface ReadTxn extends ReadHandle, AutoCloseable {
    @Override
    void close();
}
