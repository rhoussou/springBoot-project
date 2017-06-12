package inventory.exception;


public class CustomerException extends Exception {

    private static final long serialVersionUID = 1L;

    private String errorMessage;
    
    private int errorCode;

    public String getErrorMessage() {
        return errorMessage;
    }
    
    public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

    public CustomerException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public CustomerException() {
        super();
    }
    
    public CustomerException(String errorMessage,int errorCode) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.setErrorCode(errorCode);
    }

	
}

