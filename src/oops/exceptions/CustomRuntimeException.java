package oops.exceptions;

public class CustomRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5743530947740576722L;

	public CustomRuntimeException() {
		// TODO Auto-generated constructor stub
	}

	public CustomRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CustomRuntimeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public CustomRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CustomRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
