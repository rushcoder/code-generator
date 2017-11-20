package me.javaroad.plugins.model;

import com.google.common.collect.Maps;
import java.io.Serializable;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * @author heyx
 */
@Getter
@Setter
public class TemplateGroup implements Serializable {
    private String name;
    private Map<String, Template> templateMap = Maps.newHashMap();

    public void addTemplate(Template template) {
        templateMap.put(template.getName(), template);
    }

    public void removeTemplate(String name) {
        templateMap.remove(name);
    }

    public boolean exists(String templateName) {
        return templateMap.containsKey(templateName);
    }
}
