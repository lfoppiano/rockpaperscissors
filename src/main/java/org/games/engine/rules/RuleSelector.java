package org.games.engine.rules;

import org.games.weapon.Weapon;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lfoppiano
 * Date: 06/02/13
 * Time: 07:47
 * To change this template use File | Settings | File Templates.
 */
public class RuleSelector {
    private List<Rule> rules;

    public Rule selectRule(Weapon w1, Weapon w2) throws IllegalAccessException, InstantiationException {
        if(rules == null) {
            throw new IllegalStateException("No rules available, cannot select anything.");
        }

        Rule foundRule = null;
        for(Rule r : rules) {

            try {
                foundRule = (Rule) r.getClass().getDeclaredMethod("getResult", w1.getClass(), w2.getClass()).getDeclaringClass().newInstance();
            } catch (NoSuchMethodException e) {
                System.out.println("No method found, attemp 1 with " + w1.getClass()+" "+w2.getClass());
                try {
                    foundRule = (Rule) r.getClass().getDeclaredMethod("getResult", w2.getClass(), w1.getClass()).getDeclaringClass().newInstance();
                } catch(NoSuchMethodException e1) {
                    System.out.println("No method found, attemp 2 with " + w2.getClass()+" "+w1.getClass());
                }
            }
        }
        return foundRule;
    }


    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
