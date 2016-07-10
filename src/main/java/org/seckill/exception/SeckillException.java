package org.seckill.exception;

/**
 * Created by ziningmei on 16/7/10.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeckillException(String message) {
        super(message);
    }
}
