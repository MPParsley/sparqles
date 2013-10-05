/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package sparqles.analytics.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PIndexViewData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PIndexViewData\",\"namespace\":\"sparqles.analytics.avro\",\"fields\":[{\"name\":\"key\",\"type\":\"string\"},{\"name\":\"color\",\"type\":\"string\"},{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PIndexViewDataValues\",\"fields\":[{\"name\":\"label\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"double\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence key;
  @Deprecated public java.lang.CharSequence color;
  @Deprecated public java.util.List<sparqles.analytics.avro.PIndexViewDataValues> data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public PIndexViewData() {}

  /**
   * All-args constructor.
   */
  public PIndexViewData(java.lang.CharSequence key, java.lang.CharSequence color, java.util.List<sparqles.analytics.avro.PIndexViewDataValues> data) {
    this.key = key;
    this.color = color;
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return color;
    case 2: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.CharSequence)value$; break;
    case 1: color = (java.lang.CharSequence)value$; break;
    case 2: data = (java.util.List<sparqles.analytics.avro.PIndexViewDataValues>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'key' field.
   */
  public java.lang.CharSequence getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'color' field.
   */
  public java.lang.CharSequence getColor() {
    return color;
  }

  /**
   * Sets the value of the 'color' field.
   * @param value the value to set.
   */
  public void setColor(java.lang.CharSequence value) {
    this.color = value;
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.util.List<sparqles.analytics.avro.PIndexViewDataValues> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<sparqles.analytics.avro.PIndexViewDataValues> value) {
    this.data = value;
  }

  /** Creates a new PIndexViewData RecordBuilder */
  public static sparqles.analytics.avro.PIndexViewData.Builder newBuilder() {
    return new sparqles.analytics.avro.PIndexViewData.Builder();
  }
  
  /** Creates a new PIndexViewData RecordBuilder by copying an existing Builder */
  public static sparqles.analytics.avro.PIndexViewData.Builder newBuilder(sparqles.analytics.avro.PIndexViewData.Builder other) {
    return new sparqles.analytics.avro.PIndexViewData.Builder(other);
  }
  
  /** Creates a new PIndexViewData RecordBuilder by copying an existing PIndexViewData instance */
  public static sparqles.analytics.avro.PIndexViewData.Builder newBuilder(sparqles.analytics.avro.PIndexViewData other) {
    return new sparqles.analytics.avro.PIndexViewData.Builder(other);
  }
  
  /**
   * RecordBuilder for PIndexViewData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PIndexViewData>
    implements org.apache.avro.data.RecordBuilder<PIndexViewData> {

    private java.lang.CharSequence key;
    private java.lang.CharSequence color;
    private java.util.List<sparqles.analytics.avro.PIndexViewDataValues> data;

    /** Creates a new Builder */
    private Builder() {
      super(sparqles.analytics.avro.PIndexViewData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(sparqles.analytics.avro.PIndexViewData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.color)) {
        this.color = data().deepCopy(fields()[1].schema(), other.color);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PIndexViewData instance */
    private Builder(sparqles.analytics.avro.PIndexViewData other) {
            super(sparqles.analytics.avro.PIndexViewData.SCHEMA$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.color)) {
        this.color = data().deepCopy(fields()[1].schema(), other.color);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.data)) {
        this.data = data().deepCopy(fields()[2].schema(), other.data);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'key' field */
    public java.lang.CharSequence getKey() {
      return key;
    }
    
    /** Sets the value of the 'key' field */
    public sparqles.analytics.avro.PIndexViewData.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'key' field has been set */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'key' field */
    public sparqles.analytics.avro.PIndexViewData.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'color' field */
    public java.lang.CharSequence getColor() {
      return color;
    }
    
    /** Sets the value of the 'color' field */
    public sparqles.analytics.avro.PIndexViewData.Builder setColor(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.color = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'color' field has been set */
    public boolean hasColor() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'color' field */
    public sparqles.analytics.avro.PIndexViewData.Builder clearColor() {
      color = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'data' field */
    public java.util.List<sparqles.analytics.avro.PIndexViewDataValues> getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public sparqles.analytics.avro.PIndexViewData.Builder setData(java.util.List<sparqles.analytics.avro.PIndexViewDataValues> value) {
      validate(fields()[2], value);
      this.data = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'data' field */
    public sparqles.analytics.avro.PIndexViewData.Builder clearData() {
      data = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public PIndexViewData build() {
      try {
        PIndexViewData record = new PIndexViewData();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.color = fieldSetFlags()[1] ? this.color : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.data = fieldSetFlags()[2] ? this.data : (java.util.List<sparqles.analytics.avro.PIndexViewDataValues>) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
