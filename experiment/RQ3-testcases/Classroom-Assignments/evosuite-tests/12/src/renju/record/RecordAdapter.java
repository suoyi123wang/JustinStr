package renju.record;

public interface RecordAdapter {
	public void save(Record record, String fileName,String mode);

	public Record load(String fileName);
}
