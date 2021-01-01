package com.udemyJpa.study.forUdemyJpa;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class customeId  implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor si, Object obj) throws HibernateException {
        Random random = null;

        random = new Random();
        int id = random.nextInt(1000);
        return new Long(id);
    }
}
