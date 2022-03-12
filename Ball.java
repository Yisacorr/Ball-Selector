/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg11;

import java.util.HashMap;

/**
 *
 * @author Yisacor
 * Ball Singleton class:
 */
class Ball {

    private static HashMap<String, Ball> colors = new HashMap<String, Ball>();
    private String color;
    private int bounces;
    private int rolls;

    /*
     *This private constructor sets the collor and initialize bounces and rolles.
     *@param c, color of the ball.
     */
    private Ball(String c) {
        color = c;
        bounces = 0;
        rolls = 0;
    }

    /*
     *method getInstance checks if the collor exist in the hashmap and 
      return the instance if it does.if not constracts new instance.
     *@param c, color of the ball.
     *@return Ball 
     */
    public static Ball getInstance(String c) {
        if (colors.containsKey(c)) {
            return colors.get(c);
        }
        colors.put(c, new Ball(c));
        return colors.get(c);
    }
    
    /*
     * bounce method inrements the #bounce
     */
    public void bounce() {
        bounces += 1;
    }

    /*
     * roll method inrements the #roll
     */
    public void roll() {
        rolls += 1;
    }

    /* This method gives color of the ball and how many bounces and
       rolles the user made in a string form.
     *@return the color of the ball, rolls, and bounces to a string
     */
    @Override
    public String toString() {
        return (color + " Ball:\n-------------------\nRolls: " + rolls + "\nBounces: " + bounces);
    }

}
