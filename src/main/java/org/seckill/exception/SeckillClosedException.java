package org.seckill.exception;

/**
 * Created by ziningmei on 16/7/10.
 */
public class SeckillClosedException extends SeckillException{

    public SeckillClosedException(String message) {
        super(message);
    }

    public SeckillClosedException(String message, Throwable cause) {
        super(message, cause);
    }
}
