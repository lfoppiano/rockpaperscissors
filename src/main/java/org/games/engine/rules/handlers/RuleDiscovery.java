package org.games.engine.rules.handlers;

import org.games.engine.annotation.ActiveRule;
import org.games.engine.rules.Rule;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 10/02/13
 * Time: 09:55
 * To change this template use File | Settings | File Templates.
 */
public class RuleDiscovery implements ApplicationContextAware {

    ApplicationContext applicationContext;


    @PostConstruct
    public void init() {
        Map<String, Object> configuredBeans = applicationContext.getBeansWithAnnotation(ActiveRule.class);

        for (String key : configuredBeans.keySet()) {

            final Rule bean = (Rule) configuredBeans.get(key);

        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
