package org.games.engine.rules.handlers;

import org.games.engine.exception.NoRuleFoundException;
import org.games.engine.rules.Rule;
import org.games.weapon.Weapon;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 06/02/13
 * Time: 07:47
 * To change this template use File | Settings | File Templates.
 */
public class RuleDispatcher {
    private List<Rule> rules;

    public Weapon invokeRule(Weapon w1, Weapon w2) throws IllegalAccessException, InstantiationException, NoRuleFoundException {
        if (rules == null || rules.size() == 0) {
            throw new IllegalStateException("No rules available, cannot select anything.");
        }

        Rule foundRule = null;

        if (w1.equals(w2)) {

        }

        for (Rule r : rules) {
            try {
                foundRule = (Rule) r.getClass().getMethod("getResult", w1.getClass(), w2.getClass()).getDeclaringClass().newInstance();
                return foundRule.getResult(w1, w2);
            } catch (NoSuchMethodException e) {
                //System.out.println("No method found, class "+ r.getClass() +" attempt 1 with " + w1.getClass()+" "+w2.getClass());
                try {
                    foundRule = (Rule) r.getClass().getMethod("getResult", w2.getClass(), w1.getClass()).getDeclaringClass().newInstance();
                    return foundRule.getResult(w2, w1);
                } catch (NoSuchMethodException e1) {
                    //System.out.println("No method found, class "+ r.getClass() +" attempt 2 with " + w2.getClass()+" "+w1.getClass());
                }
            }

        }
        throw new NoRuleFoundException("No rules found. Please buy an extension.");
    }


    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
