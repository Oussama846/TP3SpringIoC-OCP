package org.example.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Exemple: rendre DaoImpl2 prioritaire
// dao/DaoImpl2.java
@Primary
@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override public double getValue(){ return 150.0; }
}