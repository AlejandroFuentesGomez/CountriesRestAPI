package es.alejandrofuentes.CountriesRestAPI.generators;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;
import java.util.UUID;

public class IdGenerator implements IdentifierGenerator {
    public static final String generatorName = "idGenerator";

    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) throws HibernateException {
        Random random = new Random();
        int randomId = random.nextInt(1000000);
        return Long.valueOf(randomId);    }
}
