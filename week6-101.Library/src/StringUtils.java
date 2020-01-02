/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hmamin
 */
public class StringUtils {
    
    public static boolean included(String parent, String child) {
        if (parent.isEmpty() || child.isEmpty()) {
            return false;
        }
        return parent.toLowerCase().contains(child.trim().toLowerCase());
    }
}
