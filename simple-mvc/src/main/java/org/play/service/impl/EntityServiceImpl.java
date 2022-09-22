package org.play.service.impl;

import org.play.bean.Entity;
import org.play.service.EntityService;

public class EntityServiceImpl implements EntityService {
    @Override
    public Entity getEntity() {
        return new Entity("This is an entity");
    }
}
