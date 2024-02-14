public class Record extends AbstractRecord {
	private Object key, value;

	public Record(Object givenKey, Object givenValue) {
		key = givenKey;
		value = givenValue;
	}

	@Override
	public Object getKey() {
		return key;
	}

	@Override
	public Object getValue() {
		return value;
	}

}
