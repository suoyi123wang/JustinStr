package cn.ios.junit.util.log;

public class Log {

	private static final boolean DEBUG = true;

	private static final boolean ERROR_DEBUG = true;

	private static OnPrintListener onPrintListener = null;

	public static void e(Object... objects) {
		if (ERROR_DEBUG) {
			StringBuffer sb = new StringBuffer();
			if (objects == null) {
				sb.append("null");
			} else {
				for (Object obj : objects) {
					sb.append(obj);
				}
			}
			System.err.println(sb.toString());
			if (onPrintListener != null) {
				onPrintListener.onPrint(sb.toString(), true);
			}
		}
	}

	public static void i(Object... objects) {
		if (DEBUG) {
			StringBuffer sb = new StringBuffer();
			if (objects == null) {
				sb.append("null");
			} else {
				for (Object obj : objects) {
					sb.append(obj);
				}
			}
			System.out.println(sb.toString());
			if (onPrintListener != null) {
				onPrintListener.onPrint(sb.toString(), false);
			}
		}
	}

	public interface OnPrintListener {
		public void onPrint(String msg, boolean error);
	}
}
