package renju;

import renju.Database;

public interface DatebaseAdapter {
	public void save(Database record, String fileName);

	public Database load(String fileName);

}
