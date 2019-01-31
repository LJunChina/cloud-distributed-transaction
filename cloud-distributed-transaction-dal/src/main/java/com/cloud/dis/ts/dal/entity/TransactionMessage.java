package com.cloud.dis.ts.dal.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 事务消息实体
 * @author Jon_China
 * @since 2019年1月31日15:57:33
 * @version 1.0
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Data
@Table(name = "transaction_message")
public class TransactionMessage implements Serializable {
    private static final long serialVersionUID = 2448225016776741805L;

    @Column(name = "ID",unique = true)
    @Id
    @GenericGenerator(name = "idGenerator",strategy = "identity")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "idGenerator")
    private Long id;
}
