public class NegativeAmountException extends RuntimeException { 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmountException(String errorMessage) {
        super(errorMessage);
        
    }
}