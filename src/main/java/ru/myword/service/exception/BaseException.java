package ru.myword.service.exception;

/**
 *
 * @author Maria Amend
 * @since 05.11.2019
 */
public class BaseException extends RuntimeException
{
    public BaseException(String message)
    {
        super(message);
    }

    public BaseException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
