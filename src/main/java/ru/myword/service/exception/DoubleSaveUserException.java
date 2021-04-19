package ru.myword.service.exception;

/**
 * Ошибка повтороного сохранения пользователя
 *
 * @author Maria Amend
 * @since 03.11.2019
 */
public class DoubleSaveUserException extends BaseException
{
    public DoubleSaveUserException(String message)
    {
        super(message);
    }

    public DoubleSaveUserException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
