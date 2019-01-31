package com.cloud.dis.ts.dal.respository;

import com.cloud.dis.ts.dal.entity.TransactionMessage;
import org.springframework.data.repository.CrudRepository;

/**
 * 事务消息数据访问
 * @author Jon_China
 * @since 2019年1月31日15:49:09
 * @version 1.0
 * @see org.springframework.data.repository.CrudRepository
 */
public interface TransactionRepository extends CrudRepository<TransactionMessage,Long> {
}
