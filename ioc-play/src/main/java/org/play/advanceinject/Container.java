package org.play.advanceinject;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Container {
    private Map<String, String> map;
    private List<String> list;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getList() {
        return list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Properties getProperties() {
        return properties;
    }
}
