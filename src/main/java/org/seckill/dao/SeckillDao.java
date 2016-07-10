package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by ziningmei on 16/7/10.
 */
public interface SeckillDao {

    int reduceNumber(long seckillId, Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(int offset,int limit);
}
