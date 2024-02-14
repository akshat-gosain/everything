abstract class AbstractRecord {
  abstract public Object key();
  abstract public Object value();
  abstract public Comparison compare(AbstractRecord another);
    // This should return PREDECESSOR if the comparison puts this before another
    //                    MATCHING if neither can be put before the other
    //                    SUCCESSOR if another comes before this
    //                    INCOMPARABLE if none of these could be said definitely
  abstract public void show();
}
