package tftp.errors;

public abstract class Error {

	private final String msg;
	private final int code;

	public Error(String msg, int code) {
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public int getCode() {
		return code;
	}
}