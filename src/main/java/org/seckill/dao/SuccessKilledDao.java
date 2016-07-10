package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * Created by ziningmei on 16/7/10.
 */
public interface SuccessKilledDao {

    int insertSuccessKilled(long seckillId,long userPhone);

    SuccessKilled queryByIdWithSeckill(long seckillId);



}
