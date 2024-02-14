class Record extends AbstractRecord {
  private Object valueObject=0; // Concretising
  public Record(Object val) { // Concretising
    valueObject=val;
  }
  public Object key() { // Can you generalize or abstract this further away?
    return (Object)Math.round((double)value()); // An ad-hoc arrangement.
  }
  public Object value() {
    return valueObject;
  }
  public Comparison compare(AbstractRecord another) {
    long k1=(long)key(), k2=(long)(another.key()); // The same ad-hoc arrangement
    boolean b1=k1<=k2, b2=k1>=k2; // All this should be evident
    if(b1 && b2) return Comparison.MATCHING;
    if(b1 && !b2) return Comparison.PREDECESSOR;
    if(!b1 && b2) return Comparison.SUCCESSOR;
    return Comparison.INCOMPARABLE;
  }
  public void show() {
    System.out.print(" [Key: "+key()+"] [Value: "+value()+"] ");
  }
}
