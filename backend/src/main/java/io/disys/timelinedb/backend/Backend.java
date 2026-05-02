package io.disys.timelinedb.backend;

public interface Backend extends AutoCloseable {
    WriteTxn beginWrite();
    ReadTxn beginRead();
    Snapshot snapshot();
}
