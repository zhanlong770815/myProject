package net.imwork.zhanlong.exception;

public class PasswordException extends Exception
{
    private String message;

    public PasswordException(String message)
    {
        super(message);
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
