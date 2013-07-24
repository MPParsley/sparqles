/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package core;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EndpointResult extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EndpointResult\",\"namespace\":\"core\",\"fields\":[{\"name\":\"endpoint\",\"type\":{\"type\":\"record\",\"name\":\"Endpoint\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"}]}},{\"name\":\"start\",\"type\":\"long\"},{\"name\":\"end\",\"type\":\"long\"}],\"imports\":[\"Endpoint.avsc\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public core.Endpoint endpoint;
  @Deprecated public long start;
  @Deprecated public long end;

  /**
   * Default constructor.
   */
  public EndpointResult() {}

  /**
   * All-args constructor.
   */
  public EndpointResult(core.Endpoint endpoint, java.lang.Long start, java.lang.Long end) {
    this.endpoint = endpoint;
    this.start = start;
    this.end = end;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return endpoint;
    case 1: return start;
    case 2: return end;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: endpoint = (core.Endpoint)value$; break;
    case 1: start = (java.lang.Long)value$; break;
    case 2: end = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'endpoint' field.
   */
  public core.Endpoint getEndpoint() {
    return endpoint;
  }

  /**
   * Sets the value of the 'endpoint' field.
   * @param value the value to set.
   */
  public void setEndpoint(core.Endpoint value) {
    this.endpoint = value;
  }

  /**
   * Gets the value of the 'start' field.
   */
  public java.lang.Long getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(java.lang.Long value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'end' field.
   */
  public java.lang.Long getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(java.lang.Long value) {
    this.end = value;
  }

  /** Creates a new EndpointResult RecordBuilder */
  public static core.EndpointResult.Builder newBuilder() {
    return new core.EndpointResult.Builder();
  }
  
  /** Creates a new EndpointResult RecordBuilder by copying an existing Builder */
  public static core.EndpointResult.Builder newBuilder(core.EndpointResult.Builder other) {
    return new core.EndpointResult.Builder(other);
  }
  
  /** Creates a new EndpointResult RecordBuilder by copying an existing EndpointResult instance */
  public static core.EndpointResult.Builder newBuilder(core.EndpointResult other) {
    return new core.EndpointResult.Builder(other);
  }
  
  /**
   * RecordBuilder for EndpointResult instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EndpointResult>
    implements org.apache.avro.data.RecordBuilder<EndpointResult> {

    private core.Endpoint endpoint;
    private long start;
    private long end;

    /** Creates a new Builder */
    private Builder() {
      super(core.EndpointResult.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(core.EndpointResult.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing EndpointResult instance */
    private Builder(core.EndpointResult other) {
            super(core.EndpointResult.SCHEMA$);
      if (isValidValue(fields()[0], other.endpoint)) {
        this.endpoint = data().deepCopy(fields()[0].schema(), other.endpoint);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.start)) {
        this.start = data().deepCopy(fields()[1].schema(), other.start);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.end)) {
        this.end = data().deepCopy(fields()[2].schema(), other.end);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'endpoint' field */
    public core.Endpoint getEndpoint() {
      return endpoint;
    }
    
    /** Sets the value of the 'endpoint' field */
    public core.EndpointResult.Builder setEndpoint(core.Endpoint value) {
      validate(fields()[0], value);
      this.endpoint = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'endpoint' field has been set */
    public boolean hasEndpoint() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'endpoint' field */
    public core.EndpointResult.Builder clearEndpoint() {
      endpoint = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'start' field */
    public java.lang.Long getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public core.EndpointResult.Builder setStart(long value) {
      validate(fields()[1], value);
      this.start = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'start' field */
    public core.EndpointResult.Builder clearStart() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'end' field */
    public java.lang.Long getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public core.EndpointResult.Builder setEnd(long value) {
      validate(fields()[2], value);
      this.end = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'end' field */
    public core.EndpointResult.Builder clearEnd() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public EndpointResult build() {
      try {
        EndpointResult record = new EndpointResult();
        record.endpoint = fieldSetFlags()[0] ? this.endpoint : (core.Endpoint) defaultValue(fields()[0]);
        record.start = fieldSetFlags()[1] ? this.start : (java.lang.Long) defaultValue(fields()[1]);
        record.end = fieldSetFlags()[2] ? this.end : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
