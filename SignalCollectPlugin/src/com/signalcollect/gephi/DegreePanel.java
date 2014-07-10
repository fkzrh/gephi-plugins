/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.signalcollect.gephi;

import javax.swing.JPanel;

/**
 *
 * @author flaviokeller
 */
public class DegreePanel extends JPanel {

    private boolean directed;

    public boolean isDirected() {
        return directed;
    }

    public void setDirected(boolean b) {
        directed = b;
    }
}
