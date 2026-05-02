package io.disys.timelinedb.backend;

import java.io.IOException;
import java.nio.file.Path;

public interface Snapshot extends AutoCloseable {
    void take();
    long size();
}
