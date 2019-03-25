/*
 * This file is generated by jOOQ.
 */
package io.github.adorableskullmaster.nozomi.core.database.generated.tables;


import io.github.adorableskullmaster.nozomi.core.database.generated.Indexes;
import io.github.adorableskullmaster.nozomi.core.database.generated.Keys;
import io.github.adorableskullmaster.nozomi.core.database.generated.Public;
import io.github.adorableskullmaster.nozomi.core.database.generated.tables.records.GuildsRecord;
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
public class Guilds extends TableImpl<GuildsRecord> {

  /**
   * The reference instance of <code>public.guilds</code>
   */
  public static final Guilds GUILDS = new Guilds();
  private static final long serialVersionUID = -1089978569;
  /**
   * The column <code>public.guilds.id</code>.
   */
  public final TableField<GuildsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");
  /**
   * The column <code>public.guilds.pwid</code>.
   */
  public final TableField<GuildsRecord, Integer> PWID = createField("pwid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
  /**
   * The column <code>public.guilds.pwkey</code>.
   */
  public final TableField<GuildsRecord, String> PWKEY = createField("pwkey", org.jooq.impl.SQLDataType.CLOB, this, "");
  /**
   * The column <code>public.guilds.jointexts</code>.
   */
  public final TableField<GuildsRecord, Boolean> JOINTEXTS = createField("jointexts", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.leavetexts</code>.
   */
  public final TableField<GuildsRecord, Boolean> LEAVETEXTS = createField("leavetexts", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.warnotifier</code>.
   */
  public final TableField<GuildsRecord, Boolean> WARNOTIFIER = createField("warnotifier", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.applicantnotifier</code>.
   */
  public final TableField<GuildsRecord, Boolean> APPLICANTNOTIFIER = createField("applicantnotifier", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.banknotifier</code>.
   */
  public final TableField<GuildsRecord, Boolean> BANKNOTIFIER = createField("banknotifier", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.nationtracker</code>.
   */
  public final TableField<GuildsRecord, Boolean> NATIONTRACKER = createField("nationtracker", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.vmbeigetracker</code>.
   */
  public final TableField<GuildsRecord, Boolean> VMBEIGETRACKER = createField("vmbeigetracker", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");
  /**
   * The column <code>public.guilds.autocounter</code>.
   */
  public final TableField<GuildsRecord, Boolean> AUTOCOUNTER = createField("autocounter", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

  /**
   * Create a <code>public.guilds</code> table reference
   */
  public Guilds() {
    this(DSL.name("guilds"), null);
  }

  /**
   * Create an aliased <code>public.guilds</code> table reference
   */
  public Guilds(String alias) {
    this(DSL.name(alias), GUILDS);
  }

  /**
   * Create an aliased <code>public.guilds</code> table reference
   */
  public Guilds(Name alias) {
    this(alias, GUILDS);
  }

  private Guilds(Name alias, Table<GuildsRecord> aliased) {
    this(alias, aliased, null);
  }

  private Guilds(Name alias, Table<GuildsRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> Guilds(Table<O> child, ForeignKey<O, GuildsRecord> key) {
    super(child, key, GUILDS);
  }

  /**
   * The class holding records for this type
   */
  @Override
  public Class<GuildsRecord> getRecordType() {
    return GuildsRecord.class;
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
    return Arrays.<Index>asList(Indexes.GUILDS_PKEY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<GuildsRecord> getPrimaryKey() {
    return Keys.GUILDS_PKEY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<GuildsRecord>> getKeys() {
    return Arrays.<UniqueKey<GuildsRecord>>asList(Keys.GUILDS_PKEY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Guilds as(String alias) {
    return new Guilds(DSL.name(alias), this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Guilds as(Name alias) {
    return new Guilds(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public Guilds rename(String name) {
    return new Guilds(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public Guilds rename(Name name) {
    return new Guilds(name, null);
  }
}
