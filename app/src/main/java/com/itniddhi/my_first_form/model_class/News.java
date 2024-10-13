package com.itniddhi.my_first_form.model_class;

import java.util.List;

public class News {
    private List<Data> data;
    private List<Entity> entityList;
    private Meta meta;

    public List<Data> getData() {
        return data;
    }
    public List<Entity> getEntityList() {
        return entityList;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
    public void setDatEntity(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
