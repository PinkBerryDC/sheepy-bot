/*
 * This file is generated by jOOQ.
 */
package io.github.adorableskullmaster.nozomi.core.database.generated.tables;


import io.github.adorableskullmaster.nozomi.core.database.generated.Indexes;
import io.github.adorableskullmaster.nozomi.core.database.generated.Keys;
import io.github.adorableskullmaster.nozomi.core.database.generated.Public;
import io.github.adorableskullmaster.nozomi.core.database.generated.tables.records.ChannelsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Channels extends TableImpl<ChannelsRecord> {

  /**
   * The reference instance of <code>public.channels</code>
   */
  public static final Channels CHANNELS = new Channels();
  private static final long serialVersionUID = 1824110482;
  /**
   * The column <code>public.channels.id</code>.
   */
  public final TableField<ChannelsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");
  /**
   * The column <code>public.channels.offensivechannel</code>.
   */
  public final TableField<ChannelsRecord, Long> OFFENSIVECHANNEL = createField("offensivechannel", org.jooq.impl.SQLDataType.BIGINT, this, "");
  /**
   * The column <code>public.channels.defensivechannel</code>.
   */
  public final TableField<ChannelsRecord, Long> DEFENSIVECHANNEL = createField("defensivechannel", org.jooq.impl.SQLDataType.BIGINT, this, "");
  /**
   * The column <code>public.channels.autocounter</code>.
   */
  public final TableField<ChannelsRecord, Boolean> AUTOCOUNTER = createField("autocounter", org.jooq.impl.SQLDataType.BOOLEAN, this, "");
  /**
   * The column <code>public.channels.mainchannel</code>.
   */
  public final TableField<ChannelsRecord, Long> MAINCHANNEL = createField("mainchannel", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");
  /**
   * The column <code>public.channels.govchannel</code>.
   */
  public final TableField<ChannelsRecord, Long> GOVCHANNEL = createField("govchannel", org.jooq.impl.SQLDataType.BIGINT, this, "");
  /**
   * The column <code>public.channels.vmbeigechannel</code>.
   */
  public final TableField<ChannelsRecord, Long> VMBEIGECHANNEL = createField("vmbeigechannel", org.jooq.impl.SQLDataType.BIGINT, this, "");
  /**
   * The column <code>public.channels.nationtrackerchannel</code>.
   */
  public final TableField<ChannelsRecord, Long> NATIONTRACKERCHANNEL = createField("nationtrackerchannel", org.jooq.impl.SQLDataType.BIGINT, this, "");
  /**
   * The column <code>public.channels.logchannel</code>.
   */
  public final TableField<ChannelsRecord, Long> LOGCHANNEL = createField("logchannel", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

  /**
   * Create a <code>public.channels</code> table reference
   */
  public Channels() {
    this(DSL.name("channels"), null);
  }

  /**
   * Create an aliased <code>public.channels</code> table reference
   */
  public Channels(String alias) {
    this(DSL.name(alias), CHANNELS);
  }

  /**
   * Create an aliased <code>public.channels</code> table reference
   */
  public Channels(Name alias) {
    this(alias, CHANNELS);
  }

  private Channels(Name alias, Table<ChannelsRecord> aliased) {
    this(alias, aliased, null);
  }

  private Channels(Name alias, Table<ChannelsRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> Channels(Table<O> child, ForeignKey<O, ChannelsRecord> key) {
    super(child, key, CHANNELS);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<ChannelsRecord> getRecordType() {
    return ChannelsRecord.class;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Schema getSchema() {
    return Public.PUBLIC;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.CHANNEL_PKEY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<ChannelsRecord> getPrimaryKey() {
    return Keys.CHANNEL_PKEY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<ChannelsRecord>> getKeys() {
    return Arrays.<UniqueKey<ChannelsRecord>>asList(Keys.CHANNEL_PKEY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Channels as(String alias) {
    return new Channels(DSL.name(alias), this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Channels as(Name alias) {
    return new Channels(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public Channels rename(String name) {
    return new Channels(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public Channels rename(Name name) {
    return new Channels(name, null);
  }
}
