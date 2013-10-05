/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package sparqles.core.analytics.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PIndexView extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PIndexView\",\"namespace\":\"sparqles.core.analytics.avro\",\"fields\":[{\"name\":\"threshold\",\"type\":\"long\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PIndexViewData\",\"namespace\":\"sparqles.analytics.avro\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"color\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PIndexViewDataValues\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long threshold;
  @Deprecated public java.util.List<sparqles.analytics.avro.PIndexViewData> data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public PIndexView() {}

  /**
   * All-args constructor.
   */
  public PIndexView(java.lang.Long threshold, java.util.List<sparqles.analytics.avro.PIndexViewData> data) {
    this.threshold = threshold;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return threshold;
    case 1: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: threshold = (java.lang.Long)value$; break;
    case 1: data = (java.util.List<sparqles.analytics.avro.PIndexViewData>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'threshold' field.
   */
  public java.lang.Long getThreshold() {
    return threshold;
  }

  /**
   * Sets the value of the 'threshold' field.
   * @param value the value to set.
   */
  public void setThreshold(java.lang.Long value) {
    this.threshold = value;
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.util.List<sparqles.analytics.avro.PIndexViewData> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<sparqles.analytics.avro.PIndexViewData> value) {
    this.data = value;
  }

  /** Creates a new PIndexView RecordBuilder */
  public static sparqles.core.analytics.avro.PIndexView.Builder newBuilder() {
    return new sparqles.core.analytics.avro.PIndexView.Builder();
  }
  
  /** Creates a new PIndexView RecordBuilder by copying an existing Builder */
  public static sparqles.core.analytics.avro.PIndexView.Builder newBuilder(sparqles.core.analytics.avro.PIndexView.Builder other) {
    return new sparqles.core.analytics.avro.PIndexView.Builder(other);
  }
  
  /** Creates a new PIndexView RecordBuilder by copying an existing PIndexView instance */
  public static sparqles.core.analytics.avro.PIndexView.Builder newBuilder(sparqles.core.analytics.avro.PIndexView other) {
    return new sparqles.core.analytics.avro.PIndexView.Builder(other);
  }
  
  /**
   * RecordBuilder for PIndexView instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PIndexView>
    implements org.apache.avro.data.RecordBuilder<PIndexView> {

    private long threshold;
    private java.util.List<sparqles.analytics.avro.PIndexViewData> data;

    /** Creates a new Builder */
    private Builder() {
      super(sparqles.core.analytics.avro.PIndexView.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(sparqles.core.analytics.avro.PIndexView.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.threshold)) {
        this.threshold = data().deepCopy(fields()[0].schema(), other.threshold);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PIndexView instance */
    private Builder(sparqles.core.analytics.avro.PIndexView other) {
            super(sparqles.core.analytics.avro.PIndexView.SCHEMA$);
      if (isValidValue(fields()[0], other.threshold)) {
        this.threshold = data().deepCopy(fields()[0].schema(), other.threshold);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'threshold' field */
    public java.lang.Long getThreshold() {
      return threshold;
    }
    
    /** Sets the value of the 'threshold' field */
    public sparqles.core.analytics.avro.PIndexView.Builder setThreshold(long value) {
      validate(fields()[0], value);
      this.threshold = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'threshold' field has been set */
    public boolean hasThreshold() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'threshold' field */
    public sparqles.core.analytics.avro.PIndexView.Builder clearThreshold() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'data' field */
    public java.util.List<sparqles.analytics.avro.PIndexViewData> getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public sparqles.core.analytics.avro.PIndexView.Builder setData(java.util.List<sparqles.analytics.avro.PIndexViewData> value) {
      validate(fields()[1], value);
      this.data = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'data' field */
    public sparqles.core.analytics.avro.PIndexView.Builder clearData() {
      data = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public PIndexView build() {
      try {
        PIndexView record = new PIndexView();
        record.threshold = fieldSetFlags()[0] ? this.threshold : (java.lang.Long) defaultValue(fields()[0]);
        record.data = fieldSetFlags()[1] ? this.data : (java.util.List<sparqles.analytics.avro.PIndexViewData>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
