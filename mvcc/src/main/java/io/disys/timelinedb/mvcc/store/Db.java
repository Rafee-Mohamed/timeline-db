package io.disys.timelinedb.mvcc.store;

import io.disys.timelinedb.backend.Database;

/**
 * Pair of backend database handles used by the store.
 *
 * @param revision  stores encoded revision records, keyed by encoded {@link io.disys.timelinedb.mvcc.model.Revision}
 * @param meta      stores store metadata: persisted commit seq, compaction boundary, and compaction state
 */
public record Db(Database revision, MetaDb meta) {
}
